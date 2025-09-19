package test.com.oopsw.domitory;

import java.sql.SQLException;

import com.oopsw.domitory.StudentDAO;
import com.oopsw.domitory.StudentImpl;

public class StudentTest {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		StudentDAO s = new StudentImpl();
		//System.out.println(s.getStudent(20200209));
		
	}
}
