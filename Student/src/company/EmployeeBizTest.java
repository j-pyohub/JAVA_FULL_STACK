package test.com.oopsw.company;

import com.oopsw.company.*;

public class EmployeeBizTest {
	public static void main(String[] args) {		
		//사원 또는 관리자 추가 (5명)
		EmployeeList list = new EmployeeList(5);

		System.out.println(list);
		list.addEmployee(new Employee("202502", "홍길동"));
		list.addEmployee(new Manager("202502", "이순신", "123-345"));
		list.addEmployee(new Employee("202502", "박세희"));
		list.addEmployee(new Employee("202502", "철이"));
		list.addEmployee(new Manager("202502", "미애", "222-3333"));
		System.out.println(list);
		
		//특정 사원 찾기(이름 기준)
		System.out.println(list.isEmployee("최정문"));
		
		//특정 매니저의 사무실번호 찾기(이름 기준)
		System.out.println(list.checkOfficeNumber("이순신"));
	}
}
