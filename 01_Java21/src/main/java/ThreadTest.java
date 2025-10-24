//1. 여러 번 또는 공통으로 사용할 때
class UserThread implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread());
    }
}
public class ThreadTest {
    public static void main(String[] args) {
        UserThread data = new UserThread();
        Thread t1 = new Thread(data);
        Thread t2 = new Thread(data);
        t1.start();
        t2.start();
        //2. 1번만 사용 - 무명
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("인터페이스 재정의");
            }
        };
        new Thread(r).start();
        //3. 람다식: 함수를 호출함과 동시에 오버라이딩. 매서드 1개일 때
        new Thread(()->{
            System.out.println("화살표 함수 정의");
        }).start();
    }
}
