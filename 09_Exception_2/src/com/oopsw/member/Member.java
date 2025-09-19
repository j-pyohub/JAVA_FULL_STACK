package com.oopsw.member;

public class Member {
	private String memberNumber;
	private String name;
	private char gender;
	
	public Member(String memberNumber, String name, char gender) throws GenderValueException, NameLengthException{
		setMemberNumber(memberNumber);
		setName(name);
		setGender(gender);
	}
	
	public String getMemberNumber() {
		return memberNumber;
	}
	public void setMemberNumber(String memberNumber) {
		this.memberNumber = memberNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) throws NameLengthException {
		if (name == null || name.length() < 2){
			//안되는 조건
			throw new NameLengthException("2 이상");
		}
//		if (name.length() >= 2){
//			this.name = name;
//		}
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) throws GenderValueException {
//		switch(gender){
//		case 'M':
//		case 'F':
//			this.gender = gender;
//		}
		if (gender != 'M' && gender != 'F'){
			//안되는 조건
			throw new GenderValueException("M or F"); //1. 문제를 확인하는 예외 발생
		}
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "회원번호: " + memberNumber + ", 이름: " + name + ", 성별: " + gender;
	}
	
}
