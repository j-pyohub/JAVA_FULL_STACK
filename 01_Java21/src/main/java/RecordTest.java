
//고객의 아이디, 포인트 확인
record CustomerVO(String customerId, int point){
    public void print() {
        System.out.println(customerId + " " + point);
    }
}

public class RecordTest {
    public static void main(String[] args) {
        CustomerVO customerVO = new CustomerVO("c1234", 10);
        customerVO.print();
        System.out.println(customerVO.customerId());

    }
}
