package com.oopsw.duser.repository;

import com.oopsw.duser.vo.UserVO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    //중복 체크 - 회원가입 할 때는 없어야 하고, 로그인 할 때는 없으면 안 됨
    //User findByEmail(String email);

    User findByUsername(String username);
    //google login email 확인
    User findByEmail(String email);
}
