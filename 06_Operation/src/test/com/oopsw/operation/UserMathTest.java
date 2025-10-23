package test.com.oopsw.operation;

import com.oopsw.operation.UserMath;

public class UserMathTest {
	public static void main(String[] args) {
		//UserMath u1 = new UserMath();
		/*scanner로 입력하는 것보다, 
		  아래 코드처럼 하면  테스트한 코드가 누적해서 남아있어서
		  검증하기도 좋음 
		 */
		System.out.println(UserMath.max(10, 11));
		System.out.println(UserMath.max(11, 11));
		System.out.println(UserMath.min(10, 11));
		System.out.println(UserMath.min(11, 11));
		System.out.println(UserMath.unicode(65));
		System.out.println(UserMath.unicode(-65));
		System.out.println(UserMath.grade(100));
		System.out.println(UserMath.grade(80));
		System.out.println(UserMath.grade(10));
	}
}
