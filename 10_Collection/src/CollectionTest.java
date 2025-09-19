import java.util.*;
//어떤 값(UserObjcet)을 n개 저장하는데, 순서 체크할 때도 있고, 중복 체크할 때도 있다. => 요구사항이 바뀌는 상황에는 입력값으로 바꾸기 하면 됨

public class CollectionTest {
	public static void printAll (Collection<UserObject> c){ //generic: <E> 요구사항 중에 콕 찝어서 어떤 값만 받겠다고 했을 때만 가능.
//		System.out.println(c.add(1234)); //1.5버전부터 자동으로 int(기본형) -> Interger(Wrapper class)
//		System.out.println(c.add("hi"));
		System.out.println(c.add(new UserObject("홍길동"))); //TDD - 테스트코드 먼저 만드는 것
//		System.out.println(c.add(1234)); //1.5버전부터 자동으로 int(기본형) -> Interger(Wrapper class)
//		System.out.println(c.add("hi"));
		System.out.println(c.add(new UserObject("홍길동"))); //TDD - 테스트코드 먼저 만드는 것
		System.out.println(c); //콜백패턴 - 생명주기 매서드
	}
	public static void main(String[] args) {
		printAll(new ArrayList());
		printAll(new HashSet());

	}

}
