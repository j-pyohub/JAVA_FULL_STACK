//표수정
package com.oopsw.school;

public class Student extends Person{
	private String studentNumber;

	public Student(String studentNumber, String name) {
		super(name);
		this.studentNumber = studentNumber;
	}

	@Override
	public String toString() {
		return "학생 번호: " + studentNumber + super.toString();
	}

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
	
	
}
