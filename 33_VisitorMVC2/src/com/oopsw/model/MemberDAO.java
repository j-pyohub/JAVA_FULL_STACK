package com.oopsw.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MemberDAO {
	private Connection conn;
	public MemberDAO() throws ClassNotFoundException, SQLException{
		//1.2
		//1. 드라이버 로딩
		String className = "oracle.jdbc.driver.OracleDriver";
		Class.forName(className);
		System.out.println("1. Driver loading OK");
		//2. connection
		String uri = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		String id = "hr";
		String pw = "hr";
		conn = DriverManager.getConnection(uri, id, pw);		
		System.out.println("2. 연결 OK");
	}

	public String addMember(MemberVO memberVO) {
		String name = null;
		String sql = "insert into members (member_id, pw, name, in_date) values (?, ?, ?, sysdate)";
		try{
			conn.setAutoCommit(false);
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, memberVO.getMemberId());
			pstmt.setString(2, memberVO.getPw());
			pstmt.setString(3, memberVO.getName());
			if (pstmt.executeUpdate() == 1){
				conn.commit();
				name = memberVO.getName();
			}
			pstmt.close();
		} catch(SQLException e){
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		} finally {
			try {
				conn.setAutoCommit(true);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return name;
	}

	
//	public boolean login(MemberVO memberVO) {
//		boolean result = false;
//		//JDBC select
//		if (memberVO != null)
//			result = true;
//		
//		return result;
//	}

	public String login(String memberId, String pw) {
		String name = null;
		//JDBC select
//		if(memberId.equals("jeon") && pw.equals("1234"))
//			name = "홍길동";
		String sql = "select name from members where member_id = ? and pw = ?";
		try{
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, memberId);
			pstmt.setString(2, pw);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next())
				name = rs.getString(1);
			rs.close();
			pstmt.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return name;
	}

	public boolean memberIdDupliCheck(String memberId){
		boolean result = false;
		String sql = "select member_id from members where member_id = ?";
		String memberIdChecked = null;
		try{
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, memberId);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next())
				memberIdChecked = rs.getString(1);
			if (memberIdChecked != null)
				result = true;
			rs.close();
			pstmt.close();
		} catch(SQLException e){
			e.printStackTrace();
		}
		
		return result;
	}


	
}
