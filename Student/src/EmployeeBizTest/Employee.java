package com.eun.co.kr;

public class Employee {
	
	private String number;// 직원번호
	private String name; //직원이름
	
	
	public Employee(String number, String name) {
		super();
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
		return "number=" + number + ", name=" + name ;
	}

	
	
	

}
