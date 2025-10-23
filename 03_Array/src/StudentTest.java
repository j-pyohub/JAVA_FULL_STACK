/* 1명의 학생의 정보는 학번, 이름, 성별
 * 2명의 학생의 정보를 입력하고 확인*/
public class StudentTest {
	public/*접근 지정자*/ static /*지정자*/ void/*리턴 타입-output*/ main(String[] args/*매개인자- argument, input*/){ // 선언부 - interface 

		String studentNumber = "0205119";
		String name = "허균";
		char gender = 'M';
		
		System.out.println(studentNumber);
		System.out.println(name);
		System.out.println(gender);

		studentNumber = "1501251";
		name = "허난설헌";
		gender = 'F';
		
		System.out.println(studentNumber);
		System.out.println(name);
		System.out.println(gender); // 구현부 - implementation, 처리
		
	} // 매서드
} //class
