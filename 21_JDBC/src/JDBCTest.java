import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest {
	public static void main(String[] args)
			throws ClassNotFoundException, SQLException { //try/catch는 코드가 길어져서 간단하게 테스트할 때는 throws로 쓰기도 함
		
		//1. 드라이버 로딩 --> new Xxxx(): heap 메모리 낭비 & 컴파일할 때도 체크해서 별로라 잘 안 씀, 
		String className = "oracle.jdbc.driver.OracleDriver";		
		Class.forName(className);
		System.out.println("1. Driver loading ok");
		
		//2. DBMS 연동
		String uri = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		String id = "hr";
		String pw = "hr";
		Connection conn = DriverManager.getConnection(uri, id, pw); //DriverManager는 처음부터 메모리에 있는 객체(static)
		System.out.println("2. 연결 ok");
		
		//3, 4. 업무에 따라 다른 SQL문 확인
		String sql = "select employee_id, first_name, salary from employees";
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		while (rs.next())
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getFloat(3));
		
		//5. 자원 반환
		rs.close();
		stmt.close();
		conn.close();
		
		System.out.println("프로그램 종료"); 
	}
}
