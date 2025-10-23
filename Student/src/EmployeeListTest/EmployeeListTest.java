package test.com.oopsw.company;

import com.oopsw.company.Employee;
import com.oopsw.company.EmployeeList;
import com.oopsw.company.Manager;
import com.oopsw.company.ManagerList;
/**Áö¿¬¿ì*/
public class EmployeeListTest {

	public static void main(String[] args) {
		EmployeeList employeeList = new EmployeeList(2);
		System.out.println(employeeList);
		employeeList.addEmployee(new Employee("2001001", "È«±æµ¿"));
		employeeList.addEmployee(new Manager("2001002", "È«±æµ¿", "A001"));
		System.out.println(employeeList);
		System.out.println(employeeList.isEmployee("2001001"));
		System.out.println(employeeList.isEmployee("2001003"));
		
		ManagerList managerList = new ManagerList(employeeList);
		System.out.println(managerList.getOfficeNumber("2001002"));
		System.out.println(managerList.getOfficeNumber("2001001"));
		
	}

}
