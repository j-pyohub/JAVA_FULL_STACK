package Office;

import java.util.Arrays;

public abstract class EmployeeList implements IEmployeeBiz{
	private Employee[] employees;
	private int count;
	
	public EmployeeList(int size) {
		count = 0;
		employees = new Employee[size];
	}
	
	@Override
	public void addEmployee(Employee employee) {
		if(getCount() >= employees.length)
			return;
		
		employees[count++] = employee;
	}

	@Override
	public boolean isEmployee(Employee employee) {
		for(int i = 0; i < getCount(); i++)
			if(getEmployee(i).equals(employee)) return true;
		
		return false;
	}
	
	@Override
	public String toString() {
		String msg = "";
		for(int i = 0; i < getCount(); i++){
			msg += getEmployee(i).toString();
		}
		return msg;
	}
	
	public Employee getEmployee(int index) {
		return employees[index];
	}
	
	public Employee[] getEmployees() {
		return employees;
	}

	public int getCount() {
		return count;
	}
	
}
