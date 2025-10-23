package test.com.oopsw.school;

import com.oopsw.school.Person;
import com.oopsw.school.Student;
import com.oopsw.school.Teacher;

public class OOPTest {
	public static void main(String[] args) {
		Student s1 = new Student("200101001", "홍길동", 'M');
		s1.print();
		
		Teacher t1 = new Teacher("t001", "수학", "전혜영", 'F');
		t1.print();
		
		//사이즈 (44, 55, 66), (S, M, L) - 요구사항 다양해짐. 샘플데이터를 다 포함할 수 있는 자료형 선택. int > char
		int size = 'S'; 
		//학생 또는 교사의 정보를 입력, 확인 - 학생 교사의 크기 비교를 할 수 없음, 자식보다 큰 부모(person) 타입으로 선언하는 것을 권장
		Person p = new Student("20312103", "이순신", 'M'); //선언할 때는 Person으로 가지만, 실행 할 때는 Student 기준
		p.print(); //print는 Student에 있는 것으로 실행됨 ==> 다형성(polymorphism)- 1. 상속관계, 2. 재정의 매서드, 3. 부모 선언 = new 자식()
	}
}
