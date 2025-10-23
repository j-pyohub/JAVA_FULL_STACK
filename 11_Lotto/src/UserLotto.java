import java.util.HashSet;

//Math 모든 매서드가 static
//refactoring - 코드 검증에 용이함
public class UserLotto {
	private UserLotto(){}; //
	public static String numbers(){
		return numbers(false);
	};
	
	public static String numbers(boolean flag) {
		StringBuffer sb = new StringBuffer(); //반복적으로 문자열이 수정되어야 하는 상황에 임시로 buffer 메모리 공간에 저장
		HashSet<Integer> lotto = new HashSet<>();
		
		getLotto(lotto);
		
		sb.append(lotto.toString());
		
		if (flag){
		sb.append(" 보너스 번호: ");
		sb.append(bonusNumber(lotto));
		}
		return sb.toString(); //buffer에 임시로 저장되기 때문에, toString 해야 함
	}
	
	private static int bonusNumber(HashSet<Integer> lotto) {
		int bonusNumber = 0;
		while(true){
			bonusNumber = getNumber();
			if(lotto.add(bonusNumber)) break;
		}
		return bonusNumber;
	}
	
	private static void getLotto(HashSet<Integer> lotto) {
		while(lotto.size() < 6) 
			lotto.add(getNumber());
	}
	
	private static int getNumber() {
		return (int)(Math.random()*45) + 1;
	}
	
}
