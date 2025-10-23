//표수정
package com.oopsw.school;

public class Teacher extends Person{
	private String teacherNumber;

	public Teacher(String teacherNumber, String name) {
		super(name);
		this.teacherNumber = teacherNumber;
	}
	public String getTeacherNumber() {
		return teacherNumber;
	}

	public void setTeacherNumber(String teacherNumber) {
		this.teacherNumber = teacherNumber;
	}
	@Override
	public String toString() {
		return "교사 번호: " + teacherNumber + super.toString();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((teacherNumber == null) ? 0 : teacherNumber.hashCode());
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
		Teacher other = (Teacher) obj;
		if (teacherNumber == null) {
			if (other.teacherNumber != null)
				return false;
		} else if (!teacherNumber.equals(other.teacherNumber))
			return false;
		return true;
	}
	
	

}
