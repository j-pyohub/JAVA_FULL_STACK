package com.oopsw.operation;

public class UserMath {
	//생성자 무조건 제공 - private으로 접근 못하게
	private UserMath(){};
	
	//두 수 입력해서 최대값 확인
	public static int max(int num1, int num2){
		if(num1>num2) return num1;
		return num2;
	}
	//두 수 입력해서 최소값 확인
	public static int min(int num1, int num2){
//		if(num1<num2) return num1;
//		return num2;
		return Math.max(num1, num2); //알고 있는 api가 있다면 가져다 쓰는 게 좋음
	}
	//유니코드 입력하면 해당문자 확인
	public static char unicode(int code){
		return (char) code;
	}
	
	//점수 입력하면 학점(A, B, C, F) 확인
	public static char grade(int score){
		char grade = 'F';
		if (score<=100 && score>90) grade = 'A';
		else if (score <=90 && score > 80) grade = 'B';
		else if (score <=80 && score > 70) grade = 'C';
		return grade;
	}
}
