import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//Ç¥¼öÁ¤
public class IOTest_02 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
		String m = br.readLine();
		if (m.equals("Q")){
			br.close();
			break;
			}
		System.out.println(m);
		}
	}
}
