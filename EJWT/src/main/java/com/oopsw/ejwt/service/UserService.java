package com.oopsw.ejwt.service;

import com.oopsw.ejwt.repository.User;
import com.oopsw.ejwt.repository.UserRepository;
import com.oopsw.ejwt.vo.UserVO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    //private final UserRepository userRepository;
    @Autowired //메모리에 올린 거 가져옴
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    @Autowired
    private UserRepository userRepository;

    //회원가입
    public boolean join(UserVO userVO){
        //입력받은 데이터 중복 여부 확인
        if(userRepository.findByUsername(userVO.getUsername()) != null)
            return false;
//        if (userRepository.findByEmail(userVO.getEmail()) && userRepository.findByUsername(userVO.getUsername())){
//            return false;
//        }
        //UserRequest -> UserVO (비밀번호, Role)
//        userVO.setPassword(bCryptPasswordEncoder.encode(userVO.getPassword()));
//        userVO.setRole("ROLE_USER");
        //userVO.setRole("ROLE_ADMIN");
        //userVO.setRole("ROLE_MANAGER");
        //System.out.println(userVO);
        //테이블에 등록 후 true/false 결정
        return userRepository.save(User.builder().username(userVO.getUsername())
                                    .password(bCryptPasswordEncoder.encode(userVO.getPassword()))
                                    .email(userVO.getEmail()).role("ROLE_ADMIN").build()) != null;
    }
}
