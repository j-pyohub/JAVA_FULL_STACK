package com.oopsw.bcontroller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j //로그
public class BControllerApplication {

    public static void main(String[] args) {
        //System.out.println("start");
        log.info("BControllerApplication started", BControllerApplication.class); //클래스의 타입 표현하고 싶을 때 .class
        SpringApplication.run(BControllerApplication.class, args);
        //System.out.println("end");
        log.error("error BControllerApplication finished", BControllerApplication.class);
    }

}
