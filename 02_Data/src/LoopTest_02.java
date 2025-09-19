/** 표수정 */
public class LoopTest_02 {
	public static void main(String[] args) {
		int number=2;
		String output = "";
		
		if (number <= 0){
			System.out.println("자연수 입력");
			return;
		}
		
		for (int i = 1; i < 10; i++){
			output += (number + " * " + i +" = "+ number*i + "\n");
		}
		
		System.out.println(output);

	}
}
