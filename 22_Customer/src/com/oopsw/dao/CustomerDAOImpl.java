package com.oopsw.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**표수정*/
public class CustomerDAOImpl implements CustomerDAO{
	private Connection conn;
		
	public CustomerDAOImpl() throws ClassNotFoundException, SQLException{
		String className = "oracle.jdbc.driver.OracleDriver";
		Class.forName(className);
		System.out.println("1. Driver loading OK");
		
		String uri = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		String id = "hr";
		String pw = "hr";
		conn = DriverManager.getConnection(uri, id, pw);		
		System.out.println("2. 연결 OK");
	}
	
	@Override
	public boolean addCustomer(String name, String phoneNumber) {
		
		return addCustomer(name, phoneNumber, 0); //재사용
	}

	@Override
	public boolean addCustomer(String name, String phoneNumber, int point) {
		/**매개인자 많은 것부터 구현*/
		String sql = "insert into customers (customer_id, name, phone_number, point, in_date)"
				+ "values (customer_id_seq.nextval, ?, ?, ?, sysdate)";
		boolean result = false;
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, phoneNumber);
			pstmt.setInt(3, point);
			result = pstmt.executeUpdate() == 1;
			pstmt.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public int getPoint(int customerId) {
		String sql = "select point from customers where customer_id = " + customerId;
		int result = 0;
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			if(rs.next()) result = rs.getInt(1);
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return result;
	}

	@Override
	public boolean updatePoint(int customerId, int newPoint) { //변수명&위치 인터페이스와 같은 의미가 되어야 함
		String sql = "update customers set point = ? where customer_id = ?";
		boolean result = false;
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, newPoint);
			pstmt.setInt(2, customerId);
			result = pstmt.executeUpdate() == 1;
			pstmt.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public boolean deleteCustomer(int customerId) {
		String sql = "delete from customers where customer_id = ?";
		boolean result = false;
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, customerId);
			result = pstmt.executeUpdate() == 1;
			pstmt.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	
}
