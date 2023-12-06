package practiceTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheapOAirSearchTests {
	
	
	// Pre- request needs in each annotations
	
	@BeforeClass
	public void launchBrowser() {
		System.out.println("@BeforeClass ---launchBrowser()");
	}
	
	@BeforeMethod
	public void loginCheapOAir() {
		System.out.println("@BeforeMethod ----loginCheapOAir()");
	}
	
	@Test(groups = "Flights")
	public void flightSearchTest() {
		//int i = 10/0;
		System.out.println("@Test----flightSearchTest()");
	}
	
	@Test(groups = "Flights")
	public void flightReservationTest() {
		System.out.println("@Test----flightReservationTest()");
	}
	
	// if you want to skip this test by enabled= false
	@Test(groups = "Hotels")
	public void hotelSearchTest() {
		System.out.println("@Test----hotelSearchTest()");
	}
	
	@Test(groups = "Cars")
	public void carSearchTest() {
		System.out.println("@Test----carSearchTest()");
	}
	
	@AfterMethod
    public void logoutCheapOAir() {
		System.out.println("@AfterMethod----logoutCheapOAir()");
	}
	
	
	@AfterClass
    public void quitBrowser() {
		System.out.println("@AfterClass ---quitBrowser()");
	}
	

}

