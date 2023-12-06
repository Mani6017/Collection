package junitSeleniumBasics;

import java.time.Duration;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFramesDemo {
	WebDriver driver;
	String url;

	@Before
	public void setUp() throws Exception {
		url = "https://jqueryui.com/dialog/";

		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

	}

	@Test
	public void test() throws InterruptedException {
		
		// switch to frames using by Id, index, name
		
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//span[@class=\"ui-button-icon ui-icon ui-icon-closethick\"]")).click();
		driver.switchTo().defaultContent();
		
		driver.findElement(By.name("s")).sendKeys("Mani");
		

	}

	@After
	public void tearDown() throws Exception {
		// driver.close();
	}

}
