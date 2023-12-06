package junitSeleniumBasics;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptDemo {

	WebDriver driver;
	String baseURL;
	private JavascriptExecutor js;

	@Before
	public void setUp() throws Exception {
		baseURL = "https://www.cheapoair.com/";

		driver = new ChromeDriver();
		js = (JavascriptExecutor) driver;
//		 driver.get(baseURL);
//		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

	}

	@Test
	public void test() throws InterruptedException {
		js.executeScript("window.location = 'https://www.cheapoair.com/';");
		
		long height = (long) js.executeScript("return window.innerHeight;");
		long width = (long) js.executeScript("return window.innerWidth;");

		System.out.println("Height of the window " + height);
		System.out.println("Width of the window " + width);

		driver.manage().window().maximize();
		
		long height1 = (long) js.executeScript("return window.innerHeight;");
		long width1 = (long) js.executeScript("return window.innerWidth;");

		System.out.println("Height of the window " + height1);
		System.out.println("Width of the window " + width1);
		
		Thread.sleep(2000);
		
		WebElement sellerOfTravelElement = (WebElement)js.executeScript("return document.getElementById('terms2');");
		js.executeScript("arguments[0].scrollIntoView(true)", sellerOfTravelElement);
		Thread.sleep(3000);
		sellerOfTravelElement.click();
		
		//scroll down
		js.executeScript("window.scroll(0,1900);");
		Thread.sleep(1000);
		//scroll up
		js.executeScript("window.scroll(0,-1900);");

		
		
	}

	@After
	public void tearDown() throws Exception {
		//driver.close();
	}

}
