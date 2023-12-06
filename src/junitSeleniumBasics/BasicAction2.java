package junitSeleniumBasics;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class BasicAction2 {
	WebDriver driver;
	String url;
	@Before
	public void setUp() throws Exception {
		 url = "https://www.springhilltn.org/207/Parks-Recreation";
		 
		 driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
	}
	
	@Test
	public void test() throws InterruptedException {
		/*WebElement splashpad = driver.findElement(By.xpath("/"
				+ "/a[@class=\"navMainItem secondaryNavItem\"]/parent::li[@id=\"SideItem714\"]"));
		if(splashpad.isEnabled()) {	
		splashpad.click();
		
		}
		
	    getTitle(driver);
	    getUrl(driver);
	    
	    driver.navigate().back();

	    getTitle(driver);
	    getUrl(driver);*/
		
		WebElement alltag = driver.findElement(By.xpath("//a[@class=\"navMainItem secondaryNavItem\"]/parent::li"));
	    
		 System.out.println(alltag.getSize());
		
		
	//List<WebElement> allAtag = driver.findElement(By.xpath("//a[@class=\"navMainItem secondaryNavItem\"]/parent::li"));
//	        int size = allAtag.size();
//            System.out.println("size " + size);
	}
	
	

	@After
	public void tearDown() throws Exception {
		//driver.close();
	}
	public static void getTitle(WebDriver driver) {
		String title = driver.getTitle();
		System.out.println("current title " + title);
	}
	public static void getUrl(WebDriver driver) {
		String currenturl = driver.getCurrentUrl();
		System.out.println("current url " + currenturl);
	}

	

}
