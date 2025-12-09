package com.oopsw.ejwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    //중복 체크 - 회원가입 할 때는 없어야 하고, 로그인 할 때는 없으면 안 됨

    User findByEmail(String email);

    User findByUsername(String username);
}
