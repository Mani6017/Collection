package junitSeleniumBasics;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnabledAndDisabled {
       WebDriver driver;
       String baseURL;
	@Before
	public void setUp() throws Exception {
		 baseURL= "https://www.cheapoair.com/";

		 driver = new ChromeDriver();
		 driver.get(baseURL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
	}
	
	@Test
	public void test() {
		//Enabled and Disabled
		
		WebElement filghtsTab = driver.findElement(By.id("flights"));
		
		boolean displayed = driver.findElement(By.id("flights")).isDisplayed();
		boolean enabled = driver.findElement(By.id("flights")).isEnabled();
		 
		boolean displayed1 = filghtsTab.isDisplayed();
		boolean enabled1 = filghtsTab.isEnabled();
		
		System.out.println("displayed " + displayed);
		System.out.println("Enabled " + enabled);
		
		System.out.println("displayed1 " + displayed1);
		System.out.println("Enabled1 " + enabled1);
		
		driver.findElement(By.id("flights")).click();
		
//		driver.findElement(By.xpath("//input[@id=\"from0\"]/parent::div/a")).click();
//		driver.findElement(By.id("from0")).sendKeys("Nashville");
//		
//		
//		driver.findElement(By.xpath("//input[@class=\"btn btn-lg btn-block btn-default btn-search\"]")).click();
//		
		
	}

	@After
	public void tearDown() throws Exception {
		driver.close();
	}

}
