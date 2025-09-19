import java.util.Scanner;

/**흐름 - 기본, 대안, 예외(exception)*/
public class IfTest_01 {
	public static void main(String[] args) {
		//정수를 입력 받아서 짝수를 확인
		Scanner s = new Scanner(System.in);
		
		int input = s.nextInt();
		if (input % 2 == 0){
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
	}
}
