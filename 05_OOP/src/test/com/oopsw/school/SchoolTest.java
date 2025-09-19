//표수정
package test.com.oopsw.school;

import com.oopsw.school.Person;
import com.oopsw.school.Student;
import com.oopsw.school.Teacher;

//다형성
public class SchoolTest {
	public static void main(String[] args) {
		//입력
		Person[] persons = new Person[3];
		
		persons[0] = new Student("20010001", "홍길동", 'M');
		persons[1] = new Teacher("t001", "체육", "표수정", 'F');
		persons[2] = new Student("20010050", "김길동", 'F');
		
		//출력 - 정보 중에서 학생의 정보 확인 - 학번 확인
		for (int i = 0; i < persons.length; i++) {
			if (persons[i] instanceof Student) { //person 중에서 타입이 Student인 것
				Student s = (Student) persons[i]; //object casting 필요
				System.out.println(s.getStudentNumber());
				//persons[i].print(); //다형성 - 부모로 선언하면 자식 구현부를 N개 사용
			}
		}
	}
}