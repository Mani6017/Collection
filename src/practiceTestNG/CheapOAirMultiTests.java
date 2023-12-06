package practiceTestNG;

import java.time.Duration;

import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheapOAirMultiTests {
	
	WebDriver driver;
	String url;

	@BeforeClass
	public void setUp() throws Exception {
		url = "https://www.cheapoair.com/";

		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		Thread.sleep(2000);
	}

	@BeforeMethod
	public void validateUserHomePage() {
		System.out.println("@BeforeMethod ----validateUserHomePage");
		String title = driver.getTitle();
		/*
		 * if(!title.equals("Cheap Airline Tickets, Hotels & Car Rentals | CheapOair"))
		 * { Assert.fail("we are not on Orbitz home Page!!"); }
		 */
		
		Assert.assertEquals(title, "Cheap Airline Tickets, Hotels & Car Rentals | CheapOair");
	}
	
	@Test(groups = "Generic", priority = 1)
	public void logoTest() {
		System.out.println("@Test----logoTest");
		boolean logo = driver.findElement(By.xpath("//a[@class=\"brand-logo-icon\"]")).isDisplayed();
		Assert.assertTrue(logo);
	}
	
	@Test(groups = "Generic", priority = 2)
	public void homePageTest() {
		System.out.println("@Test---homePageTest");
		String banner = driver.findElement(By.xpath("//h1[@class=\"banner__title\"]")).getText();
		
		Assert.assertEquals(banner, "Compare and Book Cheap Flights on Over 500 Airlines");
	}
	
	@Test(groups = "Flights", priority = 4, dependsOnMethods= {"flightsSearchHomePageTest"})
	public void sortOrderOfFlightsTest() {
		System.out.println("@Test---dependsOnTest --- sortOrderOfFlightsTest");
	}
	
	@Test(groups = "Flights", priority = 5, invocationCount = 2)
	public void createFlightReservations() {
		System.out.println("@Test---- createFlightReservations");
	}

	@Test(groups = "Flights", priority = 6, invocationTimeOut = 5)
	public void longTimeTest() throws InterruptedException {
		System.out.println("@Test---- longTimeTest");
	    Thread.sleep(6000);
	}

	
	@Test(groups = "Flights", priority = 3)
	public void flightsSearchHomePageTest(){
		int i = 10/0;
		
		System.out.println("@Test---flightsSearchHomePageTest");
		// clear Dep suggestion box
				WebElement clearDepSugBox = driver.findElement(By.xpath("//input[@id=\"from0\"]//following-sibling::a[@class=\"suggestion-box__clear icon\"]"));
				
				clearDepSugBox.click();
				
				driver.findElement(By.id("from0")).sendKeys("columbus");
				
				// clear Arrival suggestion box
				WebElement clearArrSugBox = driver.findElement(By.xpath("//input[@id=\"to0\"]//following-sibling::a[@class=\"suggestion-box__clear icon\"]"));
				clearArrSugBox.click();
				
				driver.findElement(By.id("to0")).sendKeys("chicago");
				
				/*
				 * //clicking on departure calendar edit box WebElement depCalEdit =
				 * driver.findElement(By.id("cal0")); depCalEdit.click();
				 * 
				 * 
				 * Thread.sleep(3000); //choose Departure Date. WebElement chooseDeparture =
				 * driver.findElement(By.
				 * xpath("//div[@class= \"calendar__single-month active\"][position() =1]//a[@aria-label=\"30 October 2023\"]"
				 * )); chooseDeparture.click();
				 * 
				 * 
				 * 
				 * //choose Arrival Date.
				 * 
				 * WebElement ArrivalDeparture = driver.findElement(By.
				 * xpath("//div[@class= \"calendar__single-month active\"][position() =1]//a[@aria-label=\"31 October 2023\"]"
				 * )); ArrivalDeparture.click();
				 */
				
				driver.findElement(By.id("searchNow")).click();
	}
	
	
	
	@AfterMethod
    public void backToHomePage() {
		System.out.println("@AfterMethod----backToHomePage");
		driver.findElement(By.xpath("//a[@class=\"brand-logo-icon\"]")).click();

	}
	
	
	@AfterClass
    public void quitBrowser() {
		System.out.println("@AfterClass ---quitBrowser()");
		driver.quit();
	}
	

}

