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

public class GetTextAndAttributeValues {
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

		WebElement bannerelement = driver.findElement(By.xpath("//h1[@class=\"banner__title\"]"));
        System.out.println(bannerelement.getText());
        
       WebElement depAttri =  driver.findElement(By.id("from0"));
       System.out.println(depAttri.getAttribute("type"));
       Thread.sleep(2000);
       System.out.println(depAttri.getAttribute("value"));

       System.out.println(depAttri.getAttribute("class"));
       System.out.println(depAttri.getAttribute("autocomplete"));

        
	}

		@After
	public void tearDown() throws Exception {
		driver.close();
	}


}
