package com.oopsw.company;
/**지연우*/
public class ManagerList extends EmployeeList{
	private Employee[] list;
	
	public ManagerList(EmployeeList employeeList){
		list = employeeList.getList();
	}
	
	public String getOfficeNumber(String number){
		
		for (int i = 0; i < list.length; i++) {
			if(list[i] instanceof Manager){
				if(number.equals(list[i].getNumber())){
					Manager m = (Manager) list[i];
					return m.getOfficeNumber();
				}
			}
		}
		return "없음";
		
	}
}
