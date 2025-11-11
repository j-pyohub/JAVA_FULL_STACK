package com.oopsw.duser.repository;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id; //나중에 연결고리 필요시 의미 있음. table 1개인 jpa인 상황에서는 굳이 필요 없음
    private String username;
    private String password;
    private String email;
    private String role; //ROLE_USER, ROLE_ADMIN ... 회원가입 시, 들어온 UI 루트를 보고 시스템이 결정하거나 관리자에 의해 결정->set 메서드 활성화
    @CreationTimestamp
    private Timestamp createdAt;


}
