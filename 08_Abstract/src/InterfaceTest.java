//abstract - 구현부X, 생성자X, static - final
interface SuperD{ //interface는 변수x, 상수o
	String SUPER_NAME = "SuperD"; //public static final 생략됨 
	void print();
	void methodD();
}
interface SuperF{
	void print(); //SuperD를 상속해도 되지만, 구현부가 없어서 안 해도 됨
	void methodF();
}

class SubDF implements SuperD, SuperF{
	@Override
	public void methodF() {
		// TODO Auto-generated method stub
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
	}
	@Override
	public void methodD() {
		// TODO Auto-generated method stub
	}
}

public class InterfaceTest {
	public static void main(String[] args) {
		
	}
}
