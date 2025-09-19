//3. CheckedException - API 있는 경우
public class ExceptionTest_03 {
	public static void main(String[] args) {
		
		try {
			Class.forName("String"); // = new String()
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("정상 종료");
	}
}
