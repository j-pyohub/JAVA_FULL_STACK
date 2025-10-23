import java.util.Scanner;

/** 표수정_1 */
public class IfTest_04 {
	public static void main(String[] args) {
		//월을 입력 받아서 해당 일 확인
		Scanner scanner = new Scanner(System.in);
		

		int month = scanner.nextInt();
		int date;
		
		if (month >= 1 && month <=12){
			switch (month){
			case 2: date = 28; break;
			case 4:
			case 6:
			case 9:
			case 11: date = 30; break;
			default: date = 31; break;
			}
			
			System.out.println(month+"월은 "+date+"일까지 입니다.");
		} else{
			System.out.println("월에 해당하는 숫자가 아님");
		}
		
//		if (month <1 || month > 12
//		if (month == 2){
//			date = 28;
//		} else if (month == 4 || month == 6 || month == 9 || month  == 11){
//			date = 30;
//		}
	}
}
