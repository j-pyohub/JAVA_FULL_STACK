import java.util.Date;
import java.util.Random;

//UI역할 - TDD: 코딩하는 방향성 설정
public class LottoTest {
	public static void main(String[] args) {
		System.out.println(new Date().toString()); //1
		System.out.println(Math.random()); 		   //2
		Random r = new Random();			 	   //3
		System.out.println(r.nextInt(10));
		System.out.println(new Random().nextInt(10)); //4
		
	}
}
