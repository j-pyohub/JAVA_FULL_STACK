package com.oopsw.cjpa.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
public class TeacherRepositoryTest {
    @Autowired
    TeacherRepository teacherRepository;

    @Test
    void addTeacher() {
        teacherRepository.save(Teachers.builder().name("이순신").build());
    }

    @Test
    void findAll() {
        System.out.println(teacherRepository.findAll()); //find: get같은 거
    }

    @Test
    void updateName(){
        Optional<Teachers> t1 = teacherRepository.findById(1);
        System.out.println(t1);
        //if(t1 != null)
        Teachers t2 = t1.get(); //.get(): Optional객체인 t1을 Teachers로 casting
        t2.setName("홍길동");
        teacherRepository.save(t2);
    }

    @Test
    void updateName2(){
        teacherRepository.save(Teachers.builder().id(2).name("세종대왕").build()); //문제 있으면 exception 출력.
    }

    @Test
    void deleteTeacher(){
        teacherRepository.deleteById(1); //문제 있으면 service에서 해결

    }
}
