package test.com.oopsw.dao;

import java.sql.SQLException;

import com.oopsw.dao.CustomerDAO;
import com.oopsw.dao.CustomerDAOImpl;

public class MainTest {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		CustomerDAO c = new CustomerDAOImpl();
		//System.out.println(c.addCustomer("홍길동", "010-2222-2222", 100));
		//System.out.println(c.addCustomer("이순신", "010-2222-3333"));
		//System.out.println(c.getPoint(5));
		//System.out.println(c.updatePoint(5, 400));
		//System.out.println(c.deleteCustomer(7));
		
		
	}
}
