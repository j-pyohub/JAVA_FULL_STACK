package com.oopsw.office;

public class ManagerList extends EmployeeList{
	
	public String getOfficeNumber(Manager manager){
		if(isEmployee(manager)) return manager.getOfficeNumber();
		return null;
	}

}
