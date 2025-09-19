package test.com.oopsw.domitory;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.oopsw.domitory.ManagerDAO;
import com.oopsw.domitory.ManagerImpl;
import com.oopsw.domitory.StudentImpl;

public class JunitManagerTest {
	static ManagerDAO m;

	@BeforeClass
	public static void allTestStart() throws Exception {
		m = new ManagerImpl();
	}

	@AfterClass
	public static void allTestEnd() throws Exception {
		System.out.println("allTestEnd()");
	}

	//@Before
	public void setUp() throws Exception {
	}

	//@After
	public void tearDown() throws Exception {
	}

	@Test
	public void loginTest() {
		assertTrue(m.login("manager1", "managerpw!"));
	}

	@Test
	public void addLogTest() {
		assertTrue(m.addLog("manager1"));
	}
	
	@Test
	public void getLogTest() {
		assertNotNull(m.getLog("manager1"));
	}
	
	@Test
	public void getManagerTest() {
		assertEquals(m.getManagerName("manager1"), "ÀÌ¼ø½Å");
	}
	
}
