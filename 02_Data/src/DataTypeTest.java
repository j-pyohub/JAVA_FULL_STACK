/** 기본형 자료형 - 정수*/
public class DataTypeTest {
	public static void main(String[] args) {
		//요구사항
		//월 입력
		int month1 = 10;
		byte month2 = 10; //VM이 범위 체크
		
		//50% 입력
		float f1 = 0.5F; //근사값
		
		byte b1 = 10 + 10;
		//자바 컴파일러가 변수의 자료형(-128~+127)을 체크
		byte b2 = (byte)(b1 + 10); //byte, short -> int
				//👆캐스팅 연산자
		byte b3 = Byte.MAX_VALUE;
		int i = Integer.MAX_VALUE;
		
		//자료형에서 실수할 만한 것
		System.out.println(b3); //127
		System.out.println(i); //2147483647
		System.out.println(b3 + 1); //128 -> byte + int
		System.out.println(i + 1); //-2147483648 -> X - 테스트 필요
		System.out.println(i + 1L); //21478483648
		
		// >>, <<, >>> 비트를 풀어서 화살표 방향으로 움직여라
		// ^ | & 비트를 풀어서 자리에서 연산하라
		// ~ 비트를 풀어서 바꿔라
		byte b5 = 5, b6 = 6; //00000101, 00000110
		System.out.println(b5 & b6);
		System.out.println(b5 | b6);
		System.out.println(b5 ^ b6); //하나만 1
		
	} //main
} //class
