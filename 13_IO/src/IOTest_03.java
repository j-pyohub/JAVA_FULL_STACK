import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
//Ç¥¼öÁ¤
public class IOTest_03 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		FileWriter fw = new FileWriter("out.txt");

		while(true){
			String m = br.readLine();
			if (m.equals("Q")){
				br.close();
				fw.close();
				break;
				}
			fw.write(m);
		}
	}
}
