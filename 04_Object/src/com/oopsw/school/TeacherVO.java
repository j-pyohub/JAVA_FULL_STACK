//표수정
//교사: 교사번호, 담당과목, 이름, 성별
//교사 정보 3명 입력
//담당 과목이 수학인 교사의 정보 확인
package com.oopsw.school;

public class TeacherVO {
	//멤버 데이터
	private String teacherNumber;
	private String subject;
	private String name;
	private char gender;

	// 초기화 생성자
	public TeacherVO(String teacherNumber, String subject, String name, char gender){
		setTeacherNumber(teacherNumber);
		setSubject(subject);
		setName(name);
		setGender(gender);
	}

	// 정보확인
	public void mathTeacher(){
		if (subject == "수학"){
			System.out.println("교사번호: " + teacherNumber);
			System.out.println("담당과목: "+ subject);
			System.out.println("이름: " + name);
			System.out.println("성별: " + gender);
		}
	}

	//set, get 매서드
	private void setTeacherNumber(String teacherNumber) {
		this.teacherNumber = teacherNumber;
	}
	public String getTeacherNumber() {
		return teacherNumber;
	}

	private void setSubject(String subject) {
		this.subject = subject;
	}
	public String getSubject() {
		return subject;
	}
	
	private void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	private void setGender(char gender) {
		this.gender = gender;
	}
	public char getGender() {
		return gender;
	}

}
