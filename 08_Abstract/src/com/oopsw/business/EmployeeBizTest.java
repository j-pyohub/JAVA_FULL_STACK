package com.oopsw.business;

public class EmployeeBizTest {
	public static void main(String[] args) {
		EmployeeList list = new ManagerList(5);
		
		list.addEmployee(new Employee("20010101", "È«±æµ¿"));
		list.addEmployee(new Manager("20050505", "±è¸Å´ÏÀú", "5200"));
		System.out.println(list.toString());
		
		System.out.println(list.isEmployee("20050505"));
		System.out.println(list.isEmployee("20010100"));
		
		if(list instanceof ManagerList ){
			ManagerList managerList = (ManagerList) list;
			System.out.println(managerList.getOfficeNumber("20050505"));
		}
	}
}
