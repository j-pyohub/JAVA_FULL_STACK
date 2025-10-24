public class SwitchTest {

    public static void main(String[] args) {
        //숫자 1개 입력 받아서 짝수 홀수 확인. 단 0은 제외
        int input = 1;
        String message = switch (input) {
            case 1, 3, 5, 7, 9 -> "홀수";
            case 2, 4, 6, 8 -> "짝수";
            default -> "한자리 숫자만";
        };
        System.out.println(message);

        switch (input){
            case 1, 3, 5, 7, 9 -> System.out.println("홀수");
            case 2, 4, 6, 8 -> System.out.println("짝수");
        }

        System.out.println(getMessage(3));
        System.out.println(getMessage(4));
        System.out.println(getMessage(10));
    }

    public static String getMessage(int input){ //객체화하면 불필요한 변수 없어짐
        return switch (input) {
            case 1, 3, 5, 7, 9 -> "홀수";
            case 2, 4, 6, 8 -> "짝수";
            default -> "한자리 숫자만";
        };
    }
}
