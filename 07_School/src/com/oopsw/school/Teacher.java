package com.oopsw.school;
//3. teacher
public class Teacher extends Person{ //3.1
	//3.2
	private String teacherNumber;
	//3.3

	public String getTeacherNumber() {
		return teacherNumber;
	}
	//3.5
	public Teacher(String name, String teacherNumber) {
		super(name);
		setTeacherNumber(teacherNumber);
	}

	public void setTeacherNumber(String teacherNumber) {
		this.teacherNumber = teacherNumber;
	}
	//3.4
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
	@Override
	public String toString() {
		return "교사 번호: " + teacherNumber +", "+ super.toString();
	}
	
	
	
}
