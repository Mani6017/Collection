package practiceTestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class TestNG_Parallel1 {
	WebDriver driver;
	String baseUrl;
	
	
	
	@Test
	public void testInChrome() throws InterruptedException {
		System.out.println("Test in Chrome-------parallel 1");
		driver = new ChromeDriver();
		baseUrl = "https://www.cheapoair.com/";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get(baseUrl);
		Thread.sleep(2000);
		String title = driver.getTitle();
	    Assert.assertEquals(title, "Cheap Airline Tickets, Hotels & Car Rentals | CheapOair");
	    System.out.println("testNG_parallel1 -> testInChrome1-> more steps");
	    driver.close();
		
	}
	
	@Test
	public void testInEdge() throws InterruptedException {
		System.out.println("Test in Edge---------parallel 1");
		driver = new EdgeDriver();
		baseUrl = "https://www.cheapoair.com/";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get(baseUrl);
		Thread.sleep(2000);
		String title = driver.getTitle();
	    Assert.assertEquals(title, "Cheap Airline Tickets, Hotels & Car Rentals | CheapOair");
	    System.out.println("testNG_parallel1 -> testInEdge1-> more steps");
	    driver.close();
		
	}

}
