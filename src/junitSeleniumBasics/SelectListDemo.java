package junitSeleniumBasics;

import java.time.Duration;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class SelectListDemo {
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
	public void test() throws InterruptedException{
		// in order to access this method using by Select class.
		//getOptions
		//selectByIndex
		//selectByValue
		//selectByVisibleText
		
         driver.findElement(By.id("flights")).click();
		
		driver.findElement(By.id("travellerButton")).click();
		
		driver.findElement(By.id("addchild")).click();
		
		WebElement element = driver.findElement(By.xpath("//select[@name= \"ChildrenAge\"]"));
		
		Select ChildrenAgeDropDown = new Select(element);
		ChildrenAgeDropDown.selectByIndex(3);
		Thread.sleep(2000);
		ChildrenAgeDropDown.selectByValue("2");
		Thread.sleep(2000);
		ChildrenAgeDropDown.selectByVisibleText("Age");
		Thread.sleep(2000);
		
	   List<WebElement> alloptions = ChildrenAgeDropDown.getOptions();
		int size = alloptions.size();
		System.out.println("all options of size " + size);
		
		for(int i =0; i<size; i++) {
			String eachoption = alloptions.get(i).getText();
			System.out.println("get all option " + eachoption);
		}
		
	}

		@After
	public void tearDown() throws Exception {
		driver.close();
	}


}
