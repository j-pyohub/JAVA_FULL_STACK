import java.util.HashMap;
import java.util.Map;

public class MapTest_02 {
	public static void main(String[] args) {
		//1~3등까지 학생의 정보  - (이름)을 확인
		Map<String, String> m1 = new HashMap<>();
		m1.put("1등", "홍길동");
		m1.put("2등", "이순신");
		m1.put("3등", "세종대왕");
		m1.put("3등", "표수정");
		System.out.println(m1);
		
		//1~3등까지 학생의 정보  - (학번, 이름 등)을 확인
		Map<Integer, Student> m2 = new HashMap<>();
		m2.put(1, new Student("20101001", "표수정"));
		System.out.println(m2);
	}
}
