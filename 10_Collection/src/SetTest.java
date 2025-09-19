import java.util.*; //패키지 내 모든 객체 활용

//어떤 값을 n개 저장하는데, 중복 저장하지 않는다. ==, equals()
public class SetTest {
	public static void main(String[] args) {
		Collection c; // 부모인 Collection으로 선언을 해서
		c = new HashSet(); //Collection의 하위 클래스로도 생성 가능. ex) ArrayList, HashSet
		
		System.out.println(c.add(1234)); //1.5버전부터 자동으로 int(기본형) -> Interger(Wrapper class)
		System.out.println(c.add("hi"));
		System.out.println(c.add(new UserObject("홍길동"))); //TDD - 테스트코드 먼저 만드는 것
		System.out.println(c.add(1234)); //1.5버전부터 자동으로 int(기본형) -> Interger(Wrapper class)
		System.out.println(c.add("hi"));
		System.out.println(c.add(new UserObject("홍길동"))); //TDD - 테스트코드 먼저 만드는 것
		System.out.println(c); //콜백패턴 - 생명주기 매서드
	}
}
