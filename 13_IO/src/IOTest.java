import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IOTest {
	public static void main(String[] args) throws IOException {
		System.out.println("1234ABCD한글");
		//InputStream is = System.in; //정해진 객체 - 노드 타입
		//byte --> char 옵션 추가 - 필터 타입
		InputStreamReader isr = new InputStreamReader(System.in); //생성자 연결 - 필수. 사용법 익히기
		//char --> String
		BufferedReader br = new BufferedReader(isr);
		String m = br.readLine(); //엔터 기준
		System.out.println(m);
		br.close();
		isr.close(); //자원을 반환한다 - 생성한 것들		
//		int input = isr.read();
//		System.out.println(input + " " + (char) input);
	} 
}
