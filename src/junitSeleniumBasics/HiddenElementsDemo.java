package junitSeleniumBasics;

import java.time.Duration;
//import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

public class HiddenElementsDemo {
       WebDriver driver;
       String baseURL;
	@Before
	public void setUp() throws Exception {
		 baseURL= "https://www.expedia.com/";

		 driver = new ChromeDriver();
		 driver.get(baseURL);
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
	}
	
	@Test
	public void test() throws InterruptedException{
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@title=\"More travel\"]")).click();
		
		Thread.sleep(2000);
		
		WebElement flightlink = driver.findElement(By.xpath("//a[@aria-label=\"Flights\"]"));
		System.out.println("flight link is displayed " + flightlink.isDisplayed());
		Thread.sleep(2000);
         
		driver.findElement(By.xpath("//button[@title=\"More travel\"]")).click();

		System.out.println("flight link is displayed " + flightlink.isDisplayed());
		
		}

		@After
	public void tearDown() throws Exception {
		//driver.close();
	}


}
