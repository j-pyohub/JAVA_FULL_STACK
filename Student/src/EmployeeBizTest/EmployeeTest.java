package test.com.eun.co.kr;

import com.eun.co.kr.Employee;
import com.eun.co.kr.EmployeeList;
import com.eun.co.kr.Manager;

public class EmployeeTest {

	public static void main(String[] args) {
		
		
		EmployeeList empList = new EmployeeList(20);
		
		
		
		//사원 추가
		empList.addEmployee(new Employee("25011001A", "고은별A"));
		empList.addEmployee(new Employee("25011001A", "고은별A"));
		empList.addEmployee(new Employee("25011002A", "고은별B"));
		empList.addEmployee(new Manager("m001", "김부장", "0211111111"));
		empList.addEmployee(new Manager("m001", "이부장", "0211111112"));
		empList.addEmployee(new Manager("m001", "삼부장", "0211111112"));
		
		
		
		System.out.println(empList);

		
		
		
		//사원 존재 여부 확인
		empList.isEmployee("m001", "김부장");
		//empList.isEmployee("25011001A", "김부장");
		
		
		//오피스 넘버 확인하기
		String officeNumber = empList.getOfficeNumber("m001");
		System.out.println(officeNumber);
		
		
	}

}
