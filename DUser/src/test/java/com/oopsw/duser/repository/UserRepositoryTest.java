package com.oopsw.duser.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;
    @Test
    public void addUser() {
        if(userRepository.findByUsername("u2") != null)
            throw new RuntimeException("이름은 중복될 수 없다"); //exception은 어떤 거든 상관 없음
        User u1 = userRepository.save(User.builder().username("u2").email("u@u.com").password("u").role("USER").build());
        System.out.println(u1);
    }
}
