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

public class DisappearHiddenElementsDemo {
       WebDriver driver;
       String baseURL;
	@Before
	public void setUp() throws Exception {
		 baseURL= "https://www.cheapoair.com/";

		 driver = new ChromeDriver();
		 driver.get(baseURL);
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
	}
	
	@Test
	public void test() throws InterruptedException{
		driver.findElement(By.id("flights")).click();

		driver.findElement(By.id("combo1")).click();
		Thread.sleep(2000);

		WebElement premiumeconomy = driver.findElement(By.id("Class-combo1-1"));
		System.out.println("premium economy is displayed" + premiumeconomy.isDisplayed());
		Thread.sleep(2000);

		driver.findElement(By.id("combo1")).click();
		System.out.println("premium economy is displayed" + premiumeconomy.isDisplayed());

	}

		@After
	public void tearDown() throws Exception {
		driver.close();
	}


}
