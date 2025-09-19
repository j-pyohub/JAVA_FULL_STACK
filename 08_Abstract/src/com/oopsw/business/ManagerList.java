package com.oopsw.business;

public class ManagerList extends EmployeeList{
	
	public ManagerList(int count){
		super(count);
	}

	public String getOfficeNumber(String number){
		Employee[] list = super.getList();
		for (int i = 0; i < list.length; i++) {
			if(number.equals(list[i].getNumber())){
				Manager m = (Manager) list[i];
				return m.getOfficeNumber();
			} 
		} return null; //return "결과 없음";
		
	}
}
