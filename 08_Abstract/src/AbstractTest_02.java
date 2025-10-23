//사람의 정보를 출력한다. 정보 중에는 이름 등이 있다. = 유연성(기준에 따라 지금 결정할 것과 나중에 결정할 것 구분): bottom-up
//2.2 1개 이상 추상 매서드가 있으면 무조건 추상 클래스
abstract class SuperB{
	public void methodB(){} //{} 구현부 있다 -> 업무가 명확하다
	public abstract void print(); //2.1 abstract method --> 업무는 있으나 구현부를 정할 수 없을 때.(구현부x)
}
//2.3 추상 클래스를 상속받은 추상 메서드는 재정의 필수
class SubB extends SuperB{
	@Override
	public void print() {
		System.out.println("Sub's print()");
	}	
}
public class AbstractTest_02 {
	public static void main(String[] args) {
		SuperB b1;
		b1 = new SubB();
		b1.methodB();
		b1.print(); //재정의
	}
}
