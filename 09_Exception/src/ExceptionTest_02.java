import java.util.Scanner;
//2. RuntimeException - API 있는 경우: 문서 보고 예측
public class ExceptionTest_02 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try{
		int input = s.nextInt();
		} catch(RuntimeException ex){
			ex.printStackTrace();
		}
		System.out.println("정상 종료");
	}
}
