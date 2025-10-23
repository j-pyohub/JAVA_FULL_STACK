package com.oopsw.company;

public class Manager extends Employee{
	private String departmentName;

	public Manager(String employeeNumber, String name, int salary, String departmentName) {
		super(employeeNumber, name, salary);
		setDepartmentName(departmentName);
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	@Override
	public void print() {
		super.print();
		System.out.println("ºÎ¼­¸í: " + departmentName);
	}
	

}
