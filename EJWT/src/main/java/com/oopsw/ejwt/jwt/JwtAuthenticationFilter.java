package com.oopsw.ejwt.jwt;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.oopsw.ejwt.auth.PrincipalDetails;
import com.oopsw.ejwt.vo.UserVO;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import tools.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.Date;
import java.util.Map;

@RequiredArgsConstructor
//로그인 기능은 사용하고 싶은데, 수동으로 만들어야 하니 UsernamePasswordAuthenticationFilter 상속받아 재정의
public class JwtAuthenticationFilter extends UsernamePasswordAuthenticationFilter { //이름 나줃에는 JwtUserNamePassword~~로 하는 게 상속 더 잘 이해됨
        private final AuthenticationManager authenticationManager;

    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, //yes/no
                                                HttpServletResponse response) throws AuthenticationException {
        //System.out.println("login 시도 필터");
        ObjectMapper mapper = new ObjectMapper();
        try {//1. 로그인할 준비
            UserVO inputData = mapper.readValue(request.getInputStream(), UserVO.class);
            //System.out.println("inputData : " + inputData);
            //로그인 시도 formLoginX -> 계정 토큰으로 변경
            UsernamePasswordAuthenticationToken authRequest = new UsernamePasswordAuthenticationToken(inputData.getUsername(), inputData.getPassword());
            //2. 실제 로그인
            Authentication auth = authenticationManager.authenticate(authRequest);//authenticationManager가 등록된 모든 객체 관리
            PrincipalDetails resultDetails = (PrincipalDetails) auth.getPrincipal(); //로그인되면 principal객체 만들어짐
            //System.out.println(resultDetails.getUser());
            //System.out.println(principalDetails.getUser().getEmail());
            return auth;
        }catch (IOException e){
            e.printStackTrace();
        }
        return null;
        //return super.attemptAuthentication(request, response); 성공/실패 없이 무조건 돌아감 -> 사용X
    }

    @Override //자동으로 yes만 넘겨줌
    protected void successfulAuthentication(HttpServletRequest request,
                                            HttpServletResponse response,
                                            FilterChain chain,
                                            Authentication authResult) throws IOException, ServletException {
        //super.successfulAuthentication(request, response, chain, authResult);
        //3. 성공적으로 로그인 - JWT 생성해야 함
        //System.out.println("로그인 성공");
        PrincipalDetails resultDetails = (PrincipalDetails) authResult.getPrincipal();
        String jwtToken = JWT.create()
                //jwt에 들어갈 내용은 회사별로 알아서 정함
                .withSubject(resultDetails.getUsername())
                .withExpiresAt(new Date(System.currentTimeMillis() + JwtProperties.EXPIRATION_TIME))
                .withClaim("id", resultDetails.getUser().getId())
                .withClaim("username", resultDetails.getUser().getUsername())
                //.sign(Algorithm.HMAC512(JwtProperties.SECRET));
                .sign(Algorithm.HMAC512(JwtProperties.SECRET.getBytes()));
        System.out.println(jwtToken);
        //4. 웹 브라우저에 전달
        response.addHeader(JwtProperties.HEADER_STRING, JwtProperties.TOKEN_PREFIX+jwtToken); //이름 상관없는데, Properties에 설정해둔 거 있으니 그거 씀 & 토큰 이름 접두사 넣음
        response.getWriter().println(Map.of("message", "login OK"));

    }
}
