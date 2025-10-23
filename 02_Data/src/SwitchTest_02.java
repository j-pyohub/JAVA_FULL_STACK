/** 표수정 */
public class SwitchTest_02 {
	public static void main(String[] args) {
		String model = "최고급 모델";
		String gift = "";
		
		switch (model){
			case "최고급 모델":
				gift = "지도서비스";
			case "고급 모델":
				gift += "&썬루프";
			case "기본 모델":
				gift += "&자동차";
				break;
			default:
				gift = "잘못된 입력";
		}
		
		System.out.println(gift);
	}
}
