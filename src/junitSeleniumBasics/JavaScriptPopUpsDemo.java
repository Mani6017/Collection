package junitSeleniumBasics;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptPopUpsDemo {
	WebDriver driver;
	String url;

	@Before
	public void setUp() throws Exception {
		url = "https://jqueryui.com/spinner/";

		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

	}

	@Test
	public void test() throws InterruptedException {
		
		driver.switchTo().frame(0);
		driver.findElement(By.id("setvalue")).click();
		driver.findElement(By.id("getvalue")).click();
		Alert alert= driver.switchTo().alert();
		alert.accept();
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.name("s")).sendKeys("Mani");
		

	}

	@After
	public void tearDown() throws Exception {
		// driver.close();
	}

}
