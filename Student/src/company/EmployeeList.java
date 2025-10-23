package com.oopsw.company;

public class EmployeeList implements EmployeeBiz{
	private Employee [] list;
	private int count;
	
	public EmployeeList(int length){
		list = new Employee[length];
	}
	
	public Employee[] getList() {
		return list;
	}
	public void setList(Employee[] list) {
		this.list = list;
	}


	@Override
	public void addEmployee(Employee e) {
		if(count == list.length) return;
		list[count++] = e;
	}
		
//	@Override
//	public String isEmployee(String name) {
//		String message = "";
//		for(int i=0; i<count; i++){
//			if(list[i].getName().equals(name)) {
//				message = "찾는 사원이 있습니다.";
//			} else {message ="찾는 사원이 없습니다.";}
//		}return message;
//	}
	
	@Override
	public boolean isEmployee(String name) {
		for(int i=0; i<count; i++){
			if(list[i].getName().equals(name)) 
				return true;
		}return false;
	}
	
	public String checkOfficeNumber(String name) {
		for(int i=0; i<count; i++){
			if(list[i].getName().equals(name) && list[i] instanceof Manager){
				return ((Manager) list[i]).getOfficeNumber();
			}
		}return null;
	}
	
	
	@Override
	public String toString() {
		String message = "";
		for(int i=0; i<count; i++){
			message += list[i].toString() + "\n";
		}
		return message;
	}
	
}
