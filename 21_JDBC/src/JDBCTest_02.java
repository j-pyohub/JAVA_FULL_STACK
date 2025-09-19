import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//표수정
/** 급여가 6000~9000인 사원의
 * 아이디, 급여 확인*/
public class JDBCTest_02 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String className = "oracle.jdbc.driver.OracleDriver";
		Class.forName(className);
		System.out.println("1. Driver loading OK");
		
		String uri = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		String id = "hr";
		String pw = "hr";
		Connection conn = DriverManager.getConnection(uri, id, pw);		
		System.out.println("2. 연결 OK");
		
		int input1 = 6000;
		int input2 = 9000;
		
		String sql = "select employee_id,salary from employees where salary between " + input1+ " and " + input2;
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		while (rs.next())
			System.out.println(rs.getInt(1) + " " + rs.getFloat(2));
		
		rs.close();
		stmt.close();
		conn.close();
		
		System.out.println("프로그램 종료");
	}
}
