package com.oopsw.duser.repository;

import com.oopsw.duser.vo.UserVO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByEmail(String email);

    boolean existsByUsername(String username);
}
