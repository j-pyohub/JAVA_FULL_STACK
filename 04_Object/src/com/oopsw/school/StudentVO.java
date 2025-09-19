package com.oopsw.school;
//학생 - 학번, 이름, 성별
public class StudentVO {
	//사용자 관점으로 소스 정리
	//Encapsulation
	//1. class's 멤버 데이터 - 일반적으로 데이터는 private 권장 (public final static int MAX_VALUE = 100 같은 경우 제외)
	private String studentNumber; //compile 시 초기화
	private String name = "이름없음"; //실행 시 값 입력
	private char gender = 'M'; //실행 시 값 입력
	
	//3. 메모리 할당 동시에 초기화 생성자 - 생성자도 기능(operation)
	//생성자를 정의하지 않으면 VM이 매개인자 없는 생성자를 기본 제공함(default)
	//overloading = 입력값의 다양성
	//생성자는 초기화가 목적이므로 return이 필요하지 않음
	public StudentVO(){};
	public StudentVO(String studentNumber, String name, char gender) {
		setStudentNumber(studentNumber);
		setName(name);
		setGender(gender);
	}
	
	//2. set, get 매서드: 일반적으로 public 권장. 매서드는 리턴타입, 매개인자 업무에 따라 선택.
	//출력값 없으면 void 쓰기. 출력값은 0or1개. 2개 이상하고 싶으면 묶어서 한번에 출력 -DTO
	//매개인자의 필요여부를 모르겠다면, 초보자는 매개인자를 넣는 게 나음.
	public String getStudentNumber() {
		return studentNumber;
	}
	private void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	
	public String getName() {
		return name; //this 생략 가능
	}
	public void setName(String name) {
		if (name != null && name.length() >= 2){
			this.name = name;
		}
	}
	
	//M, F
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		switch(gender){
		case 'M': 
		case 'F':
			this.gender = gender;
		}
	}
	
	//4. 한꺼번에 출력
	public void print(){
		System.out.println("학번: "+studentNumber);
		System.out.println("이름: "+name);
		System.out.println("성별: "+gender);
	}
	
	
}
