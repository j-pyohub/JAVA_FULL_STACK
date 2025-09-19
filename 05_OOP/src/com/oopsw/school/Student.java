package com.oopsw.school;
//VM 자식 생성자는 부모 기본생성자를 호출함
public class Student extends Person{ //extends 하면서 부모의 생성자를 호출할 수밖에 없었음 (부모클래스에 기본생성자 필요)
	private String studentNumber;

	//public Student(){super();} //코드에서 생략됐던 부분 - 오버로딩 시 사라짐
	public Student(String studentNumber, String name, char gender) {
		/*자식이 부모의 생성자를 호출할 때, 이름 대신 super 사용. 첫번째줄에 1번만 가능.
		 * => 생성자 오버로딩 -> 상속할 때 호출된 부모의 기본생성자 필요없어짐 -> 부모클래스에 기본생성자 지워도 됨*/
		super(name, gender); 
		setStudentNumber(studentNumber); //매서드는 자유롭게 호출 가능
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	//overriding = '상속받은 매서드'의 구현부 변경 => 재정의
	public void print(){
		System.out.println("학번: " + studentNumber);
		super.print();
	}
}
