package com.oopsw.ejwt.auth;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import java.util.Arrays;

@Configuration
public class CorsConfig {
    @Bean
    public CorsFilter corsFilter() {
        System.out.println("corsFilter");
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource(); //전체 source
        CorsConfiguration config = new CorsConfiguration(); //하나하나 config
        config.setAllowCredentials(true); //json 데이터를 js 통해 처리하는 것 허용!
        config.addAllowedOriginPattern("*");
        config.addAllowedHeader("*");
        config.addAllowedMethod("*"); //get, post, put, delete
        config.setExposedHeaders(Arrays.asList("Access-Control-Allow-Headers", "Authorization")); //특정 헤더 지정 옵션
        source.registerCorsConfiguration("/**", config);
        return new CorsFilter(source);
    }
}
