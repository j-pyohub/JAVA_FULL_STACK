package com.oopsw.school;
//2. 학생 정보
public class Student extends Person{ //2.1
	//2.2
	private String studentNumber;	
	//2.4
	public Student(String name, String studentNumber) {
		super(name);
		setStudentNumber(studentNumber);
	}
	//2.3
	public String getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	//2.5
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((studentNumber == null) ? 0 : studentNumber.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (studentNumber == null) {
			if (other.studentNumber != null)
				return false;
		} else if (!studentNumber.equals(other.studentNumber))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "학번: " + studentNumber +", " + super.toString();
	}
	
	
}
