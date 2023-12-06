package junitSeleniumBasics;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FirstJunitTestDemo {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		//Authentication/API Access/ Database connection
		System.out.println("1---Execute Before All The Class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		//Revoke Authentication/API Access removed/ Database connection removed
		System.out.println("4---Execute After All The Class");
	}

	@Before
	public void setUp() throws Exception {
		//Driver/ browser/ login
		System.out.println("2---Execute Before Each Test");
	}

	@After
	public void tearDown() throws Exception {
		//log out/ close browser/ clear cache/ screenshots
		System.out.println("3---Execute After Each Test");
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void test1() {
		fail("Not yet implemented");
	}

}
