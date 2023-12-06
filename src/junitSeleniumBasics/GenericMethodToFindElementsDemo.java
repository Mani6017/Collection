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

import utilities.GenericMethods;

public class GenericMethodToFindElementsDemo {
       WebDriver driver;
       String baseURL;
       private GenericMethods gm;
	@Before
	public void setUp() throws Exception {
		 baseURL= "https://www.cheapoair.com/";

		 driver = new ChromeDriver();
		 driver.get(baseURL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		gm = new GenericMethods(driver);
	}
	
	@Test
	public void test() throws InterruptedException{
		//driver.findElement(By.id("flights")).click();
         WebElement flightstab = gm.getElement("flights", "id");
         flightstab.click();
         
		//WebElement bannerelement = driver.findElement(By.xpath("//h1[@class=\"banner__title\"]"));
         
      //WebElement depAttri =  driver.findElement(By.id("from0"));
        
		WebElement depAttri = gm.getElement("from0", "id");
		System.out.println(depAttri.getAttribute("type"));
		System.out.println(depAttri.getAttribute("value"));

		System.out.println(depAttri.getAttribute("class"));

		System.out.println(depAttri.getAttribute("autocomplete"));

		WebElement arrival = gm.getElement("//input[@id=\"to0\"]", "xpath");
		arrival.sendKeys("springHill");
		
		WebElement linktext = gm.getElement("Cars", "linktext");
		linktext.click();
		Thread.sleep(2000);
		

	}

		@After
	public void tearDown() throws Exception {
		driver.close();
	}


}
