import java.sql.SQLException;

public class EmployeeDAOTest {
	public static void main(String[] args) {
		try {
			EmployeeDAO dao = new EmployeeDAO();
			
			//System.out.println(dao.getEmployees()); //입력값이 없을 때는 script 오류 X
			//System.out.println(dao.getEmployees(100, 300)); //입력값이 정수일 때도 X
			//System.out.println(dao.getEmployees(6000, 9000));
			System.out.println(dao.getEmployees("Steven"));
			System.out.println(dao.getEmployees("' or 1=1 --")); //SQL Injection: 1=1 무조건 true & -- 주석
			//=> 해결: 공백 압축해버리기 or 작은 따옴표(') 빼버리기 => java에서는 PreparedStatement 사용
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("end");
	}
}
