package com.oopsw.cjpa.repository;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;

@Builder //뭐가 필요할지 모르니 builder.
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity //Entity: DDL의 기초 자료
public class Teachers {
    @Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "teacher_seq") //오라클
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private String name;
    @CreationTimestamp
    @Column(updatable = false) //data 업데이트 시마다 timestamp 바꿀지? or 최초생성만?
    private Timestamp createdAt;

}