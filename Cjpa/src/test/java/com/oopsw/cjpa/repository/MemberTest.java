package com.oopsw.cjpa.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MemberTest {
    @Autowired
    private MemberRepository memberRepository;

    @Test
    void findAll() {
        System.out.println(memberRepository.findAll());
    }

    @Test
    void addMembers() {
        for (int i = 1; i <= 10; i++) {
            memberRepository.save(Members.builder().memberId("m_" + i).point(i).build());
        }
    }
}
