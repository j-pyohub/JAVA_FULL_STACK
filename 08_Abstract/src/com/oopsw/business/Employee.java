package com.oopsw.business;

public class Employee {
	private String number;
	private String name;
	
	public Employee(String number, String name) {
		setNumber(number);
		setName(name);
	}


	public String getNumber() {
		return number;
	}


	public void setNumber(String number) {
		this.number = number;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "사원 번호: " + number + ", 이름: " + name;
	}
	
	
}
