import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TypeTest {
    public static void main(String[] args) {
        //정수를 입력
        int i = 10;
        String s = "10";
        Integer i2 = 10; //1.5버전부터 Integer 객체에 정수 대입 가능
        //Integer i3 = new Integer(1234); //버전 중요.
        Integer i3 = Integer.valueOf(10); //매개인자 생성자 없애면서, valueof 강화
        Long i4 = Long.valueOf(10);
        List<Integer> i5 = Arrays.asList(1,2,3,4,5,6,7,8,9);
        //i5.add ...
        for (Integer tmp : i5) {
            System.out.println(tmp);
        }
        i5.forEach(tmp -> System.out.println(tmp));
        i5.forEach(System.out::println); // 셋 다 같은 코드

    }
}
