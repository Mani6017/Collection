package junitSeleniumBasics;

import java.time.Duration;
//import java.util.List;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

import utilities.GenericMethods;

public class GMethodToFindElementListAndElementPresent {
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
	public void testGetElementMethod() throws InterruptedException{

		System.out.println(" Running -------testGetElementMethod()");

		// driver.findElement(By.id("flights")).click();
		WebElement flightstab = gm.getElement("flights", "id");
		flightstab.click();

		WebElement bannerelement = gm.getElement("//h1[@class =\"banner__title\" ]", "xpath");
		String bannercontent = bannerelement.getText();
		System.out.println(bannercontent);

		// WebElement depAttri = driver.findElement(By.id("from0"));

		WebElement depAttri = gm.getElement("from0", "id");
		System.out.println(depAttri.getAttribute("type"));

		System.out.println("----------------------");

	}
	
	@Test
	public void testGetElementListMethod() throws InterruptedException{
       //get all of them edit box
		System.out.println(" Running -------testGetElementListMethod()");
		//it gets multiple element of text by using List to store it
        List<WebElement> elementlist = gm.getElementList("//input[@type=\"text\"]", "xpath");
        int elementsize = elementlist.size();
        System.out.println(elementsize);
		
		System.out.println("----------------------");

	}
	
	@Test
	public void testGetElementListPresentMethod() throws InterruptedException{
       //get all element is visible
		System.out.println(" Running -------testGetElementListPresentMethod()");
		boolean result = gm.isElementPresent("flights", "id");

		System.out.println("element list is present " + result);

		boolean result1 = gm.isElementPresent("flight", "id");

		System.out.println("element list is present " + result1);
		System.out.println("----------------------");

	}

		@After
	public void tearDown() throws Exception {
		driver.close();
	}


}
