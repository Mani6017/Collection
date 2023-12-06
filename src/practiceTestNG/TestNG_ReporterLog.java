package practiceTestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;



public class TestNG_ReporterLog {
	WebDriver driver;
	String baseUrl;
	
	
	//reporter log will generate in reporter output result in index.html
	@Test
	public void testInChrome() throws InterruptedException {
		Reporter.log("TestNG_ReporterLog-> test in chrome -> more steps", true);
		driver = new ChromeDriver();
		baseUrl = "https://www.cheapoair.com/";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get(baseUrl);
		Thread.sleep(2000);
		String title = driver.getTitle();
	    Assert.assertEquals(title, "Cheap Airline Tickets, Hotels & Car Rentals | CheapOair");
	    driver.close();
		
	}
	
	@Test
	public void testInEdge() throws InterruptedException {
		Reporter.log("TestNG_ReporterLog-> test in edge -> more steps", true);

		driver = new EdgeDriver();
		baseUrl = "https://www.cheapoair.com/";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get(baseUrl);
		Thread.sleep(2000);
		String title = driver.getTitle();
	    Assert.assertEquals(title, "Cheap Airline Tickets, Hotels & Car Rentals | CheapOair");
	    driver.close();
		
	}

}
