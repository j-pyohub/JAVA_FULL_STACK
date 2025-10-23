import java.util.Scanner;

/**표수정 */
public class LoopTest_03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int start;
		int end;
		String output = "";
		
		
		//입력
		while (true){
			System.out.print("구구단 시작과 끝(2~9, 시작<=끝): ");
			start = scanner.nextInt();
			end = scanner.nextInt();
			if (start>=2 && start<=end && end<=9)
				break;
		}
		
		//처리
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
