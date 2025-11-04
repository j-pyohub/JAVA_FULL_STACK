package com.oopsw.cjpa.controller.advice;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Map;

@RestControllerAdvice
public class RestUserAdviceController {
    @ExceptionHandler(NumberFormatException.class) //Exception.class: 모든 exception 처리
    public ResponseEntity<Map<String, String>> numberHandleException(Exception e){
        return ResponseEntity.status(400).body(Map.of("message", "포인트는 숫자만"));
    }

    @ExceptionHandler(Exception.class) //Exception.class: 모든 exception 처리
    public ResponseEntity<Map<String, String>> handleException(Exception e){
        return ResponseEntity.status(400).body(Map.of("message", e.getMessage())); //메시지는 ui에서 구현
    }

}
