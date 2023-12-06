
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

public class ListOfElements {
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
	public void test() throws InterruptedException {
		
		WebElement filghtsTab = driver.findElement(By.id("flights"));
		
		boolean enabled = filghtsTab.isEnabled();
		
		if(enabled) {
		filghtsTab.click();
		}
		
		//List of elements
		
		List<WebElement> allradiobuttons = driver.findElements(By.xpath(
				"//input[contains(@type , \"radio\") and contains(@name, \"tripType\")]/parent::div"));
		
		int size = allradiobuttons.size();
	
		System.out.println("number of radio button " + size);
		
		for (int i=0; i<size; i++) {
			boolean isradioselected = allradiobuttons.get(i).isSelected();
			if(!isradioselected) {
				allradiobuttons.get(i).click();
				
				Thread.sleep(3000);
				}
		}
		
		
		

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
