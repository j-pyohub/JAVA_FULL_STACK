// 월을 입력 받아서 해당 일 확인
public class SwitchTest {
	public static void main(String[] args) {
		int month = 11; //1-12
		int date = 31; // 28 30 31
		
		// no 조건 -> UI처리부에서 수정할 수도 있어서 분리
		if (month < 1 || month > 12){
			System.out.println("잘못 입력했습니다. 월(1-12)"); //UI 처리부
			return;
		}
		
		// 업무 기준
		switch (month) {
		case 2:
			date = 28;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			date = 30;
		}
		
		System.out.println(month + "월은 "+ date + "일 입니다.");
	}
	
}
