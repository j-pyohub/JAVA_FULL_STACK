import java.util.Scanner;

/** 표수정 */
public class LoopTest_02_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = 1;

		//input
		while(true){
			System.out.print("구구단 숫자(2~9)를 입력하세요: ");
			number = scanner.nextInt();
			if (number >= 2 && number <= 9)
				break;
		}
		
		String output = "";
		
		//처리
		for (int i = 1; i < 10; i++){
			output += (number + " * " + i +" = "+ number*i + "\n");
		}
		
		//output
		System.out.println(output);

	}
}
