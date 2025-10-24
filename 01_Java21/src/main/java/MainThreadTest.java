class UserThreadA implements Runnable {
    private int count;
    public void run() {
        while (true) {
            if (count >= 50) break;
            print();
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    private synchronized void print() { //synchronized: 동시X
        System.out.println(++count + Thread.currentThread().toString());
    }
}
public class MainThreadTest {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().toString());
        UserThreadA data = new UserThreadA(); //count라는 객체를 가진 data
        new Thread(data).start(); //data를 동시에 돌림 => 동시성의 문제 알아채기 어려움 => 단위테스트 중요
        new Thread(data).start(); //main thread 안에 thread를 나눔 Thread-0, Thread-1
        //화면에는 os가 결정한 순서대로 결과 보여줌. 우선순위가 같다면 내부적으로 알아서 보냄
    }
}
