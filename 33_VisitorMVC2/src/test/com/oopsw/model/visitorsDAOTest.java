package test.com.oopsw.model;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.oopsw.model.VisitorsDAO;

public class visitorsDAOTest {
	static VisitorsDAO dao;
	@BeforeClass
	public static void start() throws Exception{
		dao = new VisitorsDAO();
	}
	
	@Test
	public void writeVisitorsTest() {
		assertTrue(dao.writeVisitors("hello0922", "오늘 가입했습니다!"));
	}
	
	@Test
	public void editVisitorsTest() {
		assertTrue(dao.editVisitors("잘 부탁드립니다!", 33));
	}

	@Test
	public void deleteVisitorsTest() {
		assertTrue(dao.deleteVisitors(33));
		assertFalse(dao.deleteVisitors(1000));
	}
	
	@Test
	public void getVisitorsNameTest() {
		System.out.println(dao.getVisitorsName("이"));
	}

	@Test
	public void getVisitorsContentsTest() {
		System.out.println(dao.getVisitorsContents("안녕"));
	}
	
	@Test
	public void getVisitorsDateTest() {
		System.out.println(dao.getVisitorsDate("2024-12-31"));
	}
}
