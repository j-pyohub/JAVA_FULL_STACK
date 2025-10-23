package test.com.oopsw.dao;

import static org.junit.Assert.*; //객체 뒤 *: 모든 멤버가 static일 때, 편하게 쓰려고 다 받아옴 

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.oopsw.dao.CustomerDAO;
import com.oopsw.dao.CustomerDAOImpl;

public class JunitCustomerTest {
	static CustomerDAO c;
	
	@BeforeClass
	public static void allTestStart() throws Exception { //모든 테스트의 처음과 끝은 한번만 돌아가면 되기 때문에 static
		//System.out.println("allTestStart()");
		c = new CustomerDAOImpl();
	}

	@AfterClass 
	public static void allTestEnd() throws Exception {
		System.out.println("allTestEnd()");
	}

	//@Before
	public void unitTestStart() throws Exception {
		System.out.println("unitTestStart()");
	}

	//@After
	public void unitTestEnd() throws Exception {
		System.out.println("unitTestEnd()");
	}

	//@Test
	public void trueTest() { //내가 원하는 결과값: true
		assertTrue(1==2);
	}
	
	@Test
	public void falseTest() { //테스트의 흔적을 남기면서 테스트가 완벽함을 보여 줌
		assertFalse("hi" == new String("hi"));
	}
	
	@Test
	public void addCustomerTest(){
		assertTrue(c.addCustomer("pyo", "010-1234-5678"));
	}
	
	@Test
	public void addCustomerTest2(){
		assertTrue(c.addCustomer("이순신", "010-2222-3333", 100));
		assertTrue(c.addCustomer("이순신", "010-2222-3333", 100));
	}
	
	@Test
	public void getPointTest(){
		c.updatePoint(25, 500);
		assertEquals(500, c.getPoint(25));
	}
	
	@Test
	public void updatePointTest(){
		assertTrue(c.updatePoint(5, 400));
	}
	
	@Test /**false test */
	public void updatePointTest2(){
		assertTrue(c.updatePoint(400, 5));
	}

	@Test
	public void deleteCustomerTest(){
		assertTrue(c.deleteCustomer(5));
	}
	
	@Test /**false test*/
	public void deleteCustomerTest2(){
		assertTrue(c.deleteCustomer(400));
	}
	
	@Rollback(true)
	public void rollback(){
		
	}
}
