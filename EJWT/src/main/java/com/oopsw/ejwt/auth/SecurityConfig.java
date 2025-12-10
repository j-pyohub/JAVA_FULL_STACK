package com.oopsw.ejwt.auth;

import com.oopsw.ejwt.jwt.JwtAuthenticationFilter;
import com.oopsw.ejwt.jwt.JwtBasicAuthenticationFilter;
import com.oopsw.ejwt.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.filter.CorsFilter;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    @Autowired
    private CorsFilter corsFilter;

    @Bean //수동으로 만드는 거라서, 매개인자로 관리하는 AuthenticationConfiguration 필요
    public AuthenticationManager authenticationManager(AuthenticationConfiguration ac) throws Exception {
        return ac.getAuthenticationManager();
    }

    @Bean //수동으로 만드는 거라서, bean에 올린 AuthenticationManager 사용. UserRepository bean에 올려서 한번만 불러오게 함
    public SecurityFilterChain securityFilterChain(HttpSecurity http, AuthenticationManager am, UserRepository userRepository) throws Exception {
        http.csrf(csrf -> csrf.disable());
        //세션을 사용하지 않음. 기존 default 설정들 막음
        http.sessionManagement(session ->
                session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
        http.formLogin(form -> form.disable());
        http.logout(logout -> logout.disable());
        http.httpBasic(httpBasic -> httpBasic.disable());
        //사용자가 직접 필터 적용
        System.out.println("SecurityConfig");
        http.addFilter(corsFilter);
        http.addFilter(new JwtAuthenticationFilter(am)); //login 시도는 id&pw 각자 들어오고 메모리 유지X -> new
        http.addFilter(new JwtBasicAuthenticationFilter(am, userRepository));
        http.authorizeHttpRequests(ar ->
                ar.requestMatchers("/api/jwt/user/**").authenticated() //user로 되어 있는 경로들 접근제어
                .requestMatchers("/api/jwt/manager/**").hasAnyRole("ADMIN", "MANAGER") //ROLE_ADMIN, ROLE_MANAGER 로 된 것들 알아서 매핑해줌
                .requestMatchers("/api/jwt/admin/**").hasAnyRole("ADMIN") //permitAll: 접근 풀 수 있음
                .anyRequest().permitAll());

        return http.build();
    }
}
