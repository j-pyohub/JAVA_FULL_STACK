package com.oopsw.office;

public class EmployeeList implements EmployeeService { //interface implements
	/// member
	private Employee[] list;
	private int count; 
	
	/// constructor
	public EmployeeList(){
		this(10);
	}
	public EmployeeList(int length){
		list = new Employee[length]; 
	}
	
	@Override
	public void addEmployee(Employee employee) {
		// 내가 지정한 배열의 범위를 넘으면 끝
		if(count == list.length) return;

		// 중복저장 하지 않음
		if(isEmployee(employee)) return; 
		
		list[count++] = employee;
		
	}
	
	@Override
	public boolean isEmployee(Employee employee) {
		for(int i=0; i<count; i++){ 
			if(list[i].equals(employee)) return true; 
		}
		return false;
	}
	
	
	@Override
	public String toString() {
		String message = new String(""); 
		for(int i=0; i<count; i++){
			message += list[i] + "\n";
		}
		return message;
	}
	
	
}
