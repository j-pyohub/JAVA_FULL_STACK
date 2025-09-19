package test.com.oopsw.school;

import com.oopsw.school.StudentVO;

public class StudentTest {
	public static void main(String[] args) {
		//정수
		int number = 10;
		//학생 정보(사용자 정의 타입 - 대문자 시작 권장) 입력
		StudentVO s1 = new StudentVO(); //() = 생성자
		StudentVO s2 = new StudentVO("20010101", "홍길똥", 'F');
		
		//s2.setStudentNumber("02001001");
		s2.setName("홍길동");
		s2.setGender('F');
		
		s2.print();
		s1.print();
	}
}
