package test.com.oopsw.company;

import com.oopsw.company.Employee;
import com.oopsw.company.Manager;

public class CompanyTest {
	public static void main(String[] args) {
		//0. 입력
		Employee[] allEmployee = new Employee[5];
		
		allEmployee[0] = new Employee("20050101", "김사원", 100);
		allEmployee[1] = new Employee("20050102", "오사원", 200);
		allEmployee[2] = new Manager("20030101", "김부장", 600, "기획부");
		//allEmployee[3] = new Employee("20050305", "표사원", 30);
		//allEmployee[4] = new Manager("20030110", "최부장", 30, "총무부");
		
		//1. 사원 평균 급여 확인
		float average = 0;
		int count = 0;
		for (int i = 0; i < allEmployee.length; i++) {
			if (allEmployee[i] != null){ //빈 배열칸이 있을 경우
				average += allEmployee[i].getSalary();
				++count;
			}	}
		average = average / count;
		System.out.println("사원 평균 급여:" + average);
		
		//2. 급여 가장 많은 사원 정보 확인
		int maxSalary = allEmployee[0].getSalary();
		for (int i = 0; i < allEmployee.length; i++) {
			if (allEmployee[i] != null && maxSalary<allEmployee[i].getSalary()){
				maxSalary = allEmployee[i].getSalary();
			}
		}
		for (int i = 0; i < allEmployee.length; i++) {
			if (allEmployee[i] != null && allEmployee[i].getSalary() == maxSalary){
				allEmployee[i].print();
			}
		}

		//특정 부서 부서장 급여 확인
		String department = "기획부";
		for (int i = 0; i < allEmployee.length; i++) {
			if (allEmployee[i] instanceof Manager){ //null은 메모리에 올라가지 않으니 체크할 필요 없음
				Manager manager = (Manager) allEmployee[i];
				if (manager.getDepartmentName().equals(department)){
					System.out.println(department + " 부서장 급여: " + manager.getSalary());
					return; //break도 가능. 부서에는 부서장이 1명뿐이니까 찾으면 끝내기 (부서장 여러명이면 return 없이)
				}
			}
		}
	}
}
