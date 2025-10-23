import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

// 표수정
public class EmployeeDAO {
	private Connection conn;
	
	public EmployeeDAO() throws ClassNotFoundException, SQLException{
		String className = "oracle.jdbc.driver.OracleDriver";
		Class.forName(className);
		System.out.println("1. Driver loading OK");
		
		String uri = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		String id = "hr";
		String pw = "hr";
		conn = DriverManager.getConnection(uri, id, pw);		
		System.out.println("2. 연결 OK");
	}
	//모든 사원의 사번, 이름, 급여를 확인
	public Collection<EmployeeVO> getEmployees(){
		Collection<EmployeeVO> list = new ArrayList<>();
		String sql = "select employee_id, first_name, salary from employees";
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next())
				list.add(new EmployeeVO(rs.getInt(1), rs.getString(2), rs.getFloat(3)));			
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;
	}
	
	//급여 6000~9000에 해당하는 사원의 사번, 급여를 확인
	public Collection<EmployeeVO> getEmployees(int input1, int input2){
		//collection - 레코드의 개수가 여러개/  EmployeeVO - 입력값(컬럼)의 개수가 여러개
		Collection<EmployeeVO> list = new ArrayList<>();

		String sql = "select employee_id, salary from employees where salary between " + input1+ " and " + input2;
		
		Statement stmt;
		try {
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next())
				list.add(new EmployeeVO(rs.getInt(1), rs.getFloat(2)));
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		
		return list;
	}
	
	//특정 이름을 가진 사원의 사번, 이름, 급여를 확인
	public Collection<EmployeeVO> getEmployees(String name){
		Collection<EmployeeVO> list = new ArrayList<>();
		String sql = "select employee_id, salary from employees where first_name = ?"; //입력값이 String일 때는 '?'로 처리해야 공격성 script 예방 가능 -> PreparedStatement
		PreparedStatement pstmt = null;		// name은 이미 있는 값이라 검색할 필요 없음
		ResultSet rs = null;
		try {				
			//Statement stmt = conn.createStatement();
			pstmt =  conn.prepareStatement(sql);
			pstmt.setString(1, name); // = 'name'
			//ResultSet rs = stmt.executeQuery(sql);
			rs = pstmt.executeQuery(); //pstmt 결과에는 sql 없음
			while (rs.next())
				list.add(new EmployeeVO(rs.getInt(1), name, rs.getFloat(2)));			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
				try {if(rs != null)	rs.close();
				} catch (SQLException e) {}
				try {if(pstmt != null)	rs.close();
				} catch (SQLException e) {}			
		}
		
		return list;
	}
}
