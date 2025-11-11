package com.oopsw.duser.service;

import com.oopsw.duser.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired //메모리에 올린 거 가져옴
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    //회원가입
    public boolean join(UserVO userVO){
        //입력받은 데이터 중복 여부 확인

        //UserRequest -> UserVO (비밀번호, Role)
        userVO.setPassword(bCryptPasswordEncoder.encode(userVO.getPassword()));
        userVO.setRole("ROLE_USER");
        //userVO.setRole("ROLE_ADMIN");
        //userVO.setRole("ROLE_MANAGER");
        System.out.println(userVO);
        //테이블에 등록 후 true/false 결정
        return true;
    }
}
