package test.com.oopsw.office;


import com.oopsw.office.Employee;
import com.oopsw.office.EmployeeList;
import com.oopsw.office.ManagerList;
import com.oopsw.office.Manager;

public class EmployeeTest {
	public static void main(String[] args) {
		EmployeeList list = new ManagerList();

		Employee employee1 = new Employee("1234", "홍길동");
		Manager manager1 = new Manager("1234", "김매니", "m123");
		Manager manager2 = new Manager("1234", "박매니", "m122");
		
		list.addEmployee(employee1);
		list.addEmployee(manager1);
		list.addEmployee(manager2);
		
		System.out.println(list);
		
		System.out.println(list.isEmployee(employee1)); //특정 사원 여부 확인
		
		System.out.println(((ManagerList) list).getOfficeNumber(manager2)); //특정 매니저의 사무실 번호 확인
		
		
		
		
	}
	

}
