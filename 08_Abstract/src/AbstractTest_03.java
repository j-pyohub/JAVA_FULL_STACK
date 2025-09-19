//3. 출력, 성별확인, ... => 모든 업무에 구현부를 결정할 수 없는 상활
abstract class SuperC{ // input과 output은 있음
	public abstract void print(); //구현부x
	public abstract void methodC(); //구현부x
}

class SubC extends SuperC{
	@Override
	public void print() {
		System.out.println("SubC's print()");
		}

	@Override
	public void methodC() {
		System.out.println("SubC's methodC()");
	}
}
public class AbstractTest_03 {
	public static void main(String[] args) {
		SuperC c;
		c = new SubC();
		c.print();
		c.methodC();
	}
}
