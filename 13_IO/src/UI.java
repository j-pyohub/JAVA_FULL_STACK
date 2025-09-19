import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class UI {
	private BufferedReader br;
	private FileWriter fileWriter;
	public UI() throws Exception{
		br = new BufferedReader(new InputStreamReader(System.in));
		//scanner를 사용할 수도 있음. scanner는 아래에 readLine -> nextLint
		
		fileWriter = new FileWriter("out.txt", true); //java에서 파일이 없으면 exception없이 새로 만들어줌 but 읽기전용일 때는 예외 발생
											//true는 기존 파일 내용 뒤에 계속 붙이고 싶을 때 사용
		while(true){
			try {
				menu();
			} catch (IOException e) {
				e.printStackTrace(); //에러 메시지 정도 출력 - 프로그램 지속
			} catch (Exception e){
				System.out.println(e.getMessage());
				throw new Exception("new 예외, 다른 메시지 전달"); //menu 매서드 예외의 위치를 노출하고 싶지 않을 때, 주로 사용 --> 현재 위치만 나오기 때문에, 뒤에 어떤 예외들이 있는지 알 수 없음.
			}
		} //while
	}
	
	private void menu() throws Exception { //실제로 static 매서드는 권장하지 않음 -> 생성자 사용해서 불러옴
		System.out.print("Q를 입력하면 종료: ");
		String m = br.readLine();
		if(m == null || m.equals("Q")){
			// 2. 한번에 저장한다.
			fileWriter.close(); //close는 flush 기능도 같이 있음. close 전에 flush를 함
			throw new Exception("종료");
		}
		// 1. 그때그때 저장한다. 2. 생략하면 close할 때 호출된다 - 한꺼번에 저장
		fileWriter.write(m + "\n");
		//fileWriter.flush(); //담아서 전달하는 역할
	}

	public static void main(String[] args){
		try {
			new UI();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("정상 종료");
		}
	}
}
