import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        int[] numbers = {44, 33, 55, 77, 66};

        Arrays.sort(numbers);

        //toString을 매개인자로 넣음: Arrays 입장에선 배열을 갖고 있지 않아서, toString으로 가져와야 함
        System.out.println(Arrays.toString(numbers));

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        Arrays.stream(numbers).forEach(n -> System.out.println(n)); //람다식 출력. 재정의 필요한데, 1번만 쓰고 싶을 때

    }
}
