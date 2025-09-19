package com.oopsw.company;

import java.util.Arrays;
/**Áö¿¬¿ì*/
public class EmployeeList implements EmployeeBiz{
	private Employee[] list;
	private int count;
	
	public EmployeeList(){};
	
	public EmployeeList(int length){
		list = new Employee[length];
	}
	
	@Override
	public void addEmployee(Employee e) {
		list[count++] = e;
		
	}

	@Override
	public boolean isEmployee(String number) {
		for (int i = 0; i < count; i++) {
			if(list[i].getNumber().equals(number)) return true;
		}
		return false;
	}

	@Override
	public String toString() {
		String message = "";
		for (int i = 0; i < count; i++) {
			message += list[i].toString() + "\n";
		}
		return message;
	}

	public Employee[] getList() {
		return list;
	}

}
