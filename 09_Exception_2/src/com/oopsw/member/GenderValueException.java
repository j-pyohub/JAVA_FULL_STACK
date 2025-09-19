package com.oopsw.member;
//사용자 정의 예외 작성 - checked Exception
//1. ~~Exception 상속
public class GenderValueException extends Exception {
	//2. 부모와 연결된 생성자 정의
	public GenderValueException(String message) {
		super(message); 
	} 
	
}
