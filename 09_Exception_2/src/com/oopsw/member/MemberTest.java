package com.oopsw.member;

public class MemberTest {
	
	public static void main(String[] args) {
		Member m1 = null;
		try {
			m1 = new Member("2025082201", "홍길동", 'M');
		} catch (GenderValueException e) {
			e.printStackTrace();
		} catch (NameLengthException e) {
			e.printStackTrace();
		} //한두개면 상관없는데, 양이 많아지면 코드가 끝없이 늘어남
		Member m2 = null;
		try {
			m2 = new Member("2025082201", "홍", 'x');
		} catch (GenderValueException e) {
			e.printStackTrace();
		} catch (Exception e){
			e.printStackTrace();
		}
		
		System.out.println(m1);
		System.out.println(m2);
		
	}
}
