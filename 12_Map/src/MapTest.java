import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class MapTest {
	public static void main(String[] args) {
		//VM 정보 확인 - 예전
		Properties pro = System.getProperties();
		//System.out.println(pro.keySet());
		Set<Object> keys = pro.keySet();
		
		for (Object key : keys) {
			System.out.println(key.toString() + "=" + System.getProperty(key.toString()));
		}
		
		//1.5부터는
		Map<String, String> map = System.getenv();
		for (String key : map.keySet()) {
			System.out.println(key + "=>" + System.getProperty(key));
		}
	}
}
 