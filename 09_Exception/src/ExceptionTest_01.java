//1. RuntimeException - API 없는 경우. ex) 배열, 연산자
public class ExceptionTest_01 {
	public static void main(String[] args) {
		int num = 10;
		try{ //안정장치
		System.out.println(args[0]); // 미리 예외 상황을 체크 - 미리 예상해야 하는데, api가 없는 경우라 신입이 하기 어려움
		} catch(ArrayIndexOutOfBoundsException ex){
			ex.printStackTrace(); //exception의 흔적 분석
		}
		System.out.println("정상종료");
	}
}
