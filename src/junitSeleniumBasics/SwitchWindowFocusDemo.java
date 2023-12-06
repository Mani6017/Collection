package junitSeleniumBasics;

import java.time.Duration;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindowFocusDemo {
	WebDriver driver;
	String url;

	@Before
	public void setUp() throws Exception {
		url = "https://www.cheapoair.com/";

		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

	}

	@Test
	public void test() throws InterruptedException {
		

		String parentHandle = driver.getWindowHandle();
		System.out.println("parent handle page " + parentHandle);
		driver.findElement(By.xpath("//button[@aria-label=\"Sign In / Join ClubMiles to unlock member only deals\"]"))
		.click();
         
		driver.findElement(By.xpath("//a[@aria-label=\"Social signin Facebook\"]")).click();
		
		Set<String> handles = driver.getWindowHandles();
		for (String handle : handles) {
			System.out.println("Each window info " + handle);
			if (!handle.equals(parentHandle)) {
				driver.switchTo().window(handle);
				Thread.sleep(2000);

			driver.findElement(By.id("email")).sendKeys("Mani@text.com");
		}
		}

		driver.switchTo().window(parentHandle);

		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@class=\"fs-block form-control pr-4\"]")).sendKeys("mani@text.com");
          
//		driver.findElement(By.xpath("//button[@class=\"btn btn-lg btn-block btn-primary \"]")).click();
//		

	}

	@After
	public void tearDown() throws Exception {
		// driver.close();
	}

}
