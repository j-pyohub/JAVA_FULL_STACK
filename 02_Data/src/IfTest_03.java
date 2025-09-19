import java.util.Scanner;

/** 표수정 */
public class IfTest_03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int input = scanner.nextInt();
		
		String message = "";
		 
		if (input % 2 == 0)	message = "짝수 " + message;
		if (input % 7 == 0)	message += "7의 배수 ";
		if (input == 0) message = ""; //0인 경우 메시지 초기화
		
		System.out.println(message + "끝");
	}

}
