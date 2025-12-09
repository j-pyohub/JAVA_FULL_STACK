package com.oopsw.ejwt.controller;

import com.oopsw.ejwt.repository.User;
import com.oopsw.ejwt.service.UserService;
import com.oopsw.ejwt.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class RestApiController {
    @Autowired
    UserService userService;

    @GetMapping("main")
    public Map<String, String> main() { //json으로 return
        return Map.of("message", "MainData");
    }

    @PostMapping("join")
    public ResponseEntity<Map<String, String>> join(@RequestBody UserVO userVO) {
        //System.out.println(userVO);
        if (userService.join(userVO))
            return ResponseEntity.ok(Map.of("message", "Join OK"));

        //받는 데이터 json -> 넘기는 데이터 json
        return ResponseEntity.badRequest().body(Map.of("message", "Error"));
    }

    @GetMapping("/api/jwt/user")
    public Map<String, String> getJwtUser(Authentication authentication) {
        return Map.of("message", "user = " + authentication); //toString으로 필요한 정보 확인
    }
    @GetMapping("/api/jwt/manager")
    public Map<String, String> getJwtManager(Authentication authentication) {
        return Map.of("message", "manager = " + authentication); //toString으로 필요한 정보 확인
    }
    @GetMapping("/api/jwt/admin")
    public Map<String, String> getJwtAdmin(Authentication authentication) {
        return Map.of("message", "admin = " + authentication); //toString으로 필요한 정보 확인
    }

}
