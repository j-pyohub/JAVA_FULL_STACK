package test.com.oopsw.domitory;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.oopsw.domitory.RoomDAO;
import com.oopsw.domitory.RoomImpl;

public class JunitRoomTest {
	static RoomDAO r;
	
	@BeforeClass
	public static void allTestStart() throws Exception { //모든 테스트의 처음과 끝은 한번만 돌아가면 되기 때문에 static
		//System.out.println("allTestStart()");
		r = new RoomImpl();
	}

	@AfterClass 
	public static void allTestEnd() throws Exception {
		System.out.println("allTestEnd()");
	}
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void getRoomFloorTest(){
		assertNotNull(r.getRoomFloor(3));
	}
	
	@Test
	public void getRoomTypeTest(){
		assertNotNull(r.getRoomType(3, 1));
	}
	
	@Test
	public void getRoomStudent(){
		assertNotNull(r.getRoomStudent(310));
	}
	
	@Test
	public void getSearchRoomStudentTest(){
		assertNotNull(r.searchRoomStudent(311));
	}
	
	@Test
	public void countRoomStudentTest(){
		assertEquals(1, r.countRoomStudent(311));
	}
	
	@Test
	public void searchNoRoomStudentTest(){
		assertNotNull(r.searchNoRoomStudent("차은우"));
	}
}
