package com.eun.co.kr;

public class EmployeeList implements EmployeeBiz {

	private Employee[] list; // 직원 객체 배열
	private int count = 0;

	public EmployeeList(int length) {
		list = new Employee[length];
	}

	public Employee[] getList() {
		return list;
	}

	public void setList(Employee[] list) {
		this.list = list;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	//직원 추가 1) 일반 사원
//	@Override
//	public Employee addEmployee(Employee e) {
//
//		if(count == list.length) return null;
//		if(e == null) return null;
//		
//		for(int i=0;i<count;i++) {
//			if(list[i].equals(e)) return null;
//		}
//		
//		return list[count++] = e;
//	}
	
	
	
	
	
	//직원 추가 2) 매니저
	public Employee addEmployee(Employee e) {
		if(count == list.length) return null;
		
		for(int i=0;i<count;i++) {
			//이미 동일한 number의 직원이 등록되어 있는지 확인
			if(list[i].getNumber().equals(e.getNumber())) return null;
		}
		
		list[count++] = e;
		return e;
	}
	
	
	public Employee addEmployee(Manager m) {
		if(count == list.length) return null;
		
		for(int i=0;i<count;i++) {
			//이미 동일한 매니저가 등록되어 있는지 확인
			if(list[i] instanceof Manager) {//고유번호인 number가 있는지 체크함 -> 없으면 추가 /있으면 null 반환
				Manager existingManager = (Manager)list[i];
				if(existingManager.getNumber().equals(m.getNumber())) {
					return null;
				}
			}
		}
		
		list[count++] = m;
		return m;
	}
	

	//존재여부 확인
	@Override
	public boolean isEmployee(String number, String name) {
		
		for(int i=0;i<count;i++) {
			if(list[i].getNumber().equals(number) && list[i].getName().equals(name)) {
				
				System.out.println(name+" 사원이 존재합니다.");
				System.out.println(" ");
				return true;
			}
		}
		System.out.println("사원이 존재하지 않습니다.");
		return false;
	}
	
	
	//officeNumber 확인하기-> 매니저의 number 입력시 officeNumber 반환
	public String getOfficeNumber(String number) {//number는 매니저 번호
		
		for(int i=0;i<count;i++) {
			
			if(list[i] instanceof Manager) {
				Manager existingManager = (Manager)list[i]; //매니저 객체
				if(existingManager.getNumber().equals(number)) {//내가 찾고자하는 매니저사번과 동일하다면
					
					return  "["+list[i].getNumber()+"]"+list[i].getName()+": "+existingManager.getOfficeNumber();
				}
				
			}
		}
		
		return "";
	}

	@Override
	public String toString() {

		String message = "";

		for (int i = 0; i < count; i++) {

			message += list[i].toString() + "\n";
		}

		return message;
	}

}
