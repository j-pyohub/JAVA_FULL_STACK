public class LoopTest_01_1 {
	public static void main(String[] args) {
		// 출력을 for문 밖으로 꺼내서, 한번에 출력되게 함.
		// 메서드를 만드는 규칙과 연결
		
		String output = "";
		
		for(int i = 0; i < 11; i++){     //VM은 선언된 변수를 해제 - {} 내에 변수 바로 해제
			output += i + "\n";
			}

		System.out.println(output);
	
		//while문
		int c = 0;	
		boolean isState = true;
		while(isState){
			System.out.println(c++);
			if (c == 11) break;
		} // c는 main이 끝나야 메모리 해제 -> 관리 잘 하지 않으면 쓰레기값이 계속 생김
	}
}