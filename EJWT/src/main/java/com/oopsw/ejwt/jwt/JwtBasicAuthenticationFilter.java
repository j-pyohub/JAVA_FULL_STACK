package com.oopsw.ejwt.jwt;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.oopsw.ejwt.auth.PrincipalDetails;
import com.oopsw.ejwt.repository.User;
import com.oopsw.ejwt.repository.UserRepository;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.log4j.Log4j2;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

import java.io.IOException;

@Log4j2
public class JwtBasicAuthenticationFilter extends BasicAuthenticationFilter {
    private UserRepository userRepository;

    public JwtBasicAuthenticationFilter(AuthenticationManager authenticationManager, UserRepository userRepository) {
        super(authenticationManager);
        this.userRepository = userRepository;
        log.info("인증 - 인가 사용자 정의 필터");
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws IOException, ServletException {
        //super.doFilterInternal(request, response, chain); //FilterChain chain: 중간에서 가로채서 filterChain 바꿔 낄 수 있다는 것
        log.info("doFilter" + request.getRequestURI());
        //1. header에 원하는 토큰이 있는지 확인
        String jwtToken = request.getHeader(JwtProperties.HEADER_STRING);
        log.info("jwtToken: " + jwtToken);
        if (jwtToken == null || !jwtToken.trim().startsWith(JwtProperties.TOKEN_PREFIX)) {
            chain.doFilter(request, response); //멈추고 기존 필터 수행하게
            return; //멈춤
        }
        jwtToken = jwtToken.replace(JwtProperties.TOKEN_PREFIX, ""); //실제 토큰에는 bearer없으니, 빼기
        //2. JWT 토큰에서 내가 원하는 값 추출 - username
        String username = JWT.require(Algorithm.HMAC512(JwtProperties.SECRET))
                .build().verify(jwtToken).getClaim("username").asString();
        log.info("username: " + username);
        //유효 시간 여부 체크

        //3. 유효한 정보인지 확인(검증) - 인증, 인가 상태 체크 전달
        if(username != null) {
            User user = userRepository.findByUsername(username);
            PrincipalDetails details = new PrincipalDetails(user);
            Authentication auth = new UsernamePasswordAuthenticationToken(details, null, details.getAuthorities());
            SecurityContextHolder.getContext().setAuthentication(auth);
        }
        chain.doFilter(request, response);
    }

}
