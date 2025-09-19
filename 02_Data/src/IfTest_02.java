import java.util.Scanner;

/** 표수정 */
public class IfTest_02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int input = scanner.nextInt();
		 
		if (input % 2 == 0 || input % 7 == 0){
			System.out.println("짝수 or 7의 배수");
		} else{
			System.out.println("짝수도 아니고 7의 배수도 아님");
		}		
	}

}