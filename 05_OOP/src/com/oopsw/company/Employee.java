package com.oopsw.company;

public class Employee {
	private String employeeNumber;
	private String name;
	private int salary;
	
	public Employee(String employeeNumber, String name, int salary){
		setEmployeeNumber(employeeNumber);
		setName(name);
		setSalary(salary);
	}
	
	public String getEmployeeNumber() {
		return employeeNumber;
	}
	public void setEmployeeNumber(String employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void print() {
		System.out.println("사원번호: " + employeeNumber);
		System.out.println("이름: " + name);
		System.out.println("급여: " + salary);
	}
	
}
