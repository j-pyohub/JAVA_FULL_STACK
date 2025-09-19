package com.oopsw.business;

public class EmployeeList implements EmployeeBiz{
	private Employee[] list;
	private int count;

	public EmployeeList(){};
	
	public EmployeeList(int length) {
		list = new Employee[length];
	}
	
	@Override
	public void addEmployee(Employee employee) {
		list[count++] = employee;		
	}

	@Override
	public boolean isEmployee(String number) {
		for (int i = 0; i < count; i++) {
			if (number.equals(list[i].getNumber())) return true;
	
		} 	return false;
	}
	
	@Override
	public String toString() {
		String message = "";
		for (int i = 0; i < count; i++) {
			message += list[i] + "\n";
		}
		return message;
	}


	public Employee[] getList() {
		return list;
	}


	public void setList(Employee[] list) { // 1 : 0..* 
		this.list = list;				   // 메모리를 유지하고 싶으면 set 사용X. set과 get이 늘 세트는 아님
	}
	

}
