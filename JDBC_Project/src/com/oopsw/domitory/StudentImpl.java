package com.oopsw.domitory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class StudentImpl implements StudentDAO{
	private Connection conn;
	
	public StudentImpl() throws ClassNotFoundException, SQLException{
		String className = "oracle.jdbc.driver.OracleDriver";
		Class.forName(className);
		System.out.println("1. Driver loading OK");
		
		String uri = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		String id = "hr";
		String pw = "hr";
		conn = DriverManager.getConnection(uri, id, pw);
		System.out.println("2. ¿¬°á OK");
	}
	
	@Override
	public Collection<StudentVO> getStudents() {
		Collection<StudentVO> list = null;
		String sql = "select d.dom_student_id, s.student_number, s.name, s.academic_status, s.gender, d.room_number, d.check_in, d.expected_check_out " + 
					"from dom_student_test d, student_test s where s.student_number = d.student_number and (d.expected_check_out >= sysdate or d.room_number is null)";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			list = new ArrayList<>();
			while (rs.next()) list.add(new StudentVO(rs.getString(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getDate(7), rs.getDate(8)));
			rs.close();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	@Override
	public StudentVO getDomStudent(String domStudentId) {
		String sql = "select s.student_number, s.name, s.major, s.grade, s.term, s.academic_status, s.birth, s.gender, s.phone_number, s.address, d.check_in,"
				+ "d.expected_check_out, d.note, d.room_number from dom_student_test d, student_test s where dom_student_id = ?";
		StudentVO result = null;
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, domStudentId);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) result = new StudentVO(domStudentId, rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5),
									rs.getString(6), rs.getDate(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getDate(11), rs.getDate(12), rs.getString(12), rs.getInt(13));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public boolean updateDomStudent(String domStudentId, int roomNumber, String checkIn, String checkOut, String note) {
		String sql = "update dom_student_test set room_number = ?, check_in = ?, expected_check_out = ?, note = ? where dom_student_id = ?";
		boolean result = false;
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, roomNumber);
			pstmt.setDate(2, java.sql.Date.valueOf(checkIn));
			pstmt.setDate(3, java.sql.Date.valueOf(checkOut));
			pstmt.setString(4, note);
			pstmt.setString(5, domStudentId);			
			result = pstmt.executeUpdate() == 1;
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public boolean deleteStudent(String domStudentId) {
		boolean result = false;

		String sql2 = "delete from dom_student_test where dom_student_id = ?";
		try {
			PreparedStatement pstmt2 = conn.prepareStatement(sql2);
			pstmt2.setString(1, domStudentId);
			result = pstmt2.executeUpdate() == 1;
			pstmt2.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return result;
	}

	@Override
	public StudentVO getStudent(int studentNumber) {
		StudentVO result = null;
		String sql = "select name, major, grade, term, academic_status, birth, gender, phone_number, address"
					+ " from student_test where student_number = ?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, studentNumber);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) result = new StudentVO(studentNumber, rs.getString(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(5),
									rs.getDate(6), rs.getString(7), rs.getString(8), rs.getString(9));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}

	@Override
	public boolean addDomStudent(String domStudentId, int studentNumber, int roomNumber, String checkIn, String checkOut, String note) {
		boolean result = false;
		String sql = "insert into dom_student_test (dom_student_id, student_number, room_number, check_in, expected_check_out, note) "
				+ "values (?, ?, ?, ?, ?, ?)";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, domStudentId);
			pstmt.setInt(2, studentNumber);
			pstmt.setInt(3, roomNumber);
			pstmt.setDate(4, java.sql.Date.valueOf(checkIn));
			pstmt.setDate(5, java.sql.Date.valueOf(checkOut));
			pstmt.setString(6, note);
			result = pstmt.executeUpdate()==1;
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public Collection<StudentVO> searchName(String name) {
		Collection<StudentVO> list = new ArrayList<>();
		String sql = "select d.dom_student_id, s.student_number, s.name, s.academic_status, s.gender, d.room_number, d.check_in, d.expected_check_out "
					+ "from dom_student_test d, student_test s where s.student_number = d.student_number and s.name like '%' || ? || '%' and (d.expected_check_out >= sysdate or d.room_number is null)";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) list.add(new StudentVO(rs.getString(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getDate(7), rs.getDate(8)));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}

	@Override
	public Collection<StudentVO> searchMajor(String major) {
		Collection<StudentVO> list = new ArrayList<>();
		String sql = "select d.dom_student_id, s.student_number, s.name, s.academic_status, s.gender, d.room_number, d.check_in, d.expected_check_out "
					+ "from dom_student_test d, student_test s where s.student_number = d.student_number and s.major like '%' || ? || '%' and (d.expected_check_out >= sysdate or d.room_number is null)";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, major);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) list.add(new StudentVO(rs.getString(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getDate(7), rs.getDate(8)));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}

	@Override
	public Collection<StudentVO> searchAcademicStatus(String academicStatus) {
		Collection<StudentVO> list = new ArrayList<>();
		String sql = "select d.dom_student_id, s.student_number, s.name, s.gender, d.room_number, d.check_in, d.expected_check_out "
					+ "from dom_student_test d, student_test s where s.student_number = d.student_number and s.academic_status = ? and (d.expected_check_out >= sysdate or d.room_number is null)";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, academicStatus);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) list.add(new StudentVO(rs.getString(1), rs.getInt(2), rs.getString(3), academicStatus, rs.getString(4), rs.getInt(5), rs.getDate(6), rs.getDate(7)));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}

	@Override
	public Collection<StudentVO> searchRoomNumber(int roomNumber) {
		Collection<StudentVO> list = new ArrayList<>();
		String sql = "select d.dom_student_id, s.student_number, s.name, s.academic_status, s.gender, d.check_in, d.expected_check_out "
					+ "from dom_student_test d, student_test s where s.student_number = d.student_number and d.room_number = ? and (d.expected_check_out >= sysdate or d.room_number is null)";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, roomNumber);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) list.add(new StudentVO(rs.getString(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(4), roomNumber, rs.getDate(6), rs.getDate(7)));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}

}
