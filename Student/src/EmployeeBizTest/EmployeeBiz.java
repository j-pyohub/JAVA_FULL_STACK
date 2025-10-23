package com.eun.co.kr;

public interface EmployeeBiz {
	
	//addEmployee(Employee e) =>return type은 Employee
	public Employee addEmployee(Employee e);
	
	//isEmployee() => 특정 객체가 직원인지 확인하는 기능=>직원 고유번호 , 이름 입력시 boolean 타입 반환
	public boolean isEmployee(String number ,String name);
	
}
