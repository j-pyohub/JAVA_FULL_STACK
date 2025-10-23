public class ArgsTest {
    // 숫자를 1개 입력해서 확인
    public static void methodA(int a){
        System.out.println(a);
    }
    //숫자 n개를 입력받는다.
    public static void methodB(int ... b){ // '...': 도저히 구체적인 요구사항이 아닐 때 사용
        System.out.println(b.length);
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }

    public static void main(String[] args) {
        methodA(10);
        methodB(100);
        methodB(1,2,3,4,5);

    }
}
