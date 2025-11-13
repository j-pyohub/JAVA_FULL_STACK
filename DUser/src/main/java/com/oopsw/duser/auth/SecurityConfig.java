package com.oopsw.duser.auth;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity //스프링security를 filter-chain에 등록
@EnableGlobalMethodSecurity(securedEnabled = true)
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.csrf(csrf -> csrf.disable());
        http.authorizeHttpRequests(ar ->
                ar.requestMatchers("/user/**").authenticated() //user로 되어 있는 경로들 접근제어
                  .requestMatchers("/manager/**").hasAnyRole("ADMIN", "MANAGER") //ROLE_ADMIN, ROLE_MANAGER 로 된 것들 알아서 매핑해줌
                  .requestMatchers("/admin/**").hasAnyRole("ADMIN") //permitAll: 접근 풀 수 있음
                  .anyRequest().permitAll());

        //사용자 정의 UI 연동
        http.formLogin(form -> form.loginPage("/loginView")  //redirect가 알아서 됨
                .loginProcessingUrl("/login")
                //.usernameParameter("email") //디폴트로 login의 파라미터는 username이 되어 있는데, 커스텀하고 싶으면 바꿀 수 있음
                //어느 루트로 가든 기본 페이지로 지정
                .defaultSuccessUrl("/user")
                .failureUrl("/joinView")
        );




        return http.build();
    }
}
