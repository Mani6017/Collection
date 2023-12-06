package junitSeleniumBasics;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasicAction {
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
		//CLick and Type
		driver.findElement(By.id("flights")).click();
		driver.findElement(By.xpath("//input[@id=\"from0\"]/parent::div/a")).click();
		driver.findElement(By.id("from0")).sendKeys("Nashville");
		
		printTitleOfThePage(driver);
		printTitleOfTheUrl(driver);
		
		//newUrl
		String newUrl = "https://www.facebook.com/reg/?app_id=141101695993086&logger_id";
		driver.navigate().to(newUrl);
		
		printTitleOfThePage(driver);
		printTitleOfTheUrl(driver);
		
		//back
		driver.navigate().back();
		
		printTitleOfThePage(driver);
		printTitleOfTheUrl(driver);
		
		driver.findElement(By.xpath("//input[@class=\"btn btn-lg btn-block btn-default btn-search\"]")).click();
		
		
		
		//back
		driver.navigate().back();
		printTitleOfThePage(driver);
		printTitleOfTheUrl(driver);
		
		//forward
		 driver.navigate().forward();
		 printTitleOfThePage(driver);
			printTitleOfTheUrl(driver);
	}

	@After
	public void tearDown() throws Exception {
		driver.close();
	}

	public void printTitleOfThePage(WebDriver driver) {
		String title = driver.getTitle();
		System.out.println("current page title--- " + title);

	}
	

	public void printTitleOfTheUrl(WebDriver driver) {
	   String url =	driver.getCurrentUrl();
		System.out.println("current page url--" + url);

	}


}
