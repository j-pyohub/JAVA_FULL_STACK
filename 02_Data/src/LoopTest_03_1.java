import java.util.Scanner;

/**표수정 */
public class LoopTest_03_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int start;
		int end;
		String output = "";
		
		
		//입력 - 주변코드 
		while (true){
			System.out.print("구구단 시작(2~9): ");
			start = scanner.nextInt();
			if (start>=2 && start<=9)
				break;
		}
		
		while (true){
			System.out.print("구구단 끝(2~9, 시작보다 크거나 같게): ");
			end = scanner.nextInt();
			if (start<=end && end<=9)
				break;
		}
		
		
		//처리 - 핵심코드
		for (int i = 1; i<=9; i++){
			for (int j = start; j<=end; j++){

				output += (j + " * " + i + " = " + j*i + "   ");
				if (j*i<10){ //열 맞춤
					output += " ";
				}
			}
			output += "\n";
		}
		
		System.out.println(output);
	}
}
