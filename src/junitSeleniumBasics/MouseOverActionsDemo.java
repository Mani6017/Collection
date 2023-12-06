package junitSeleniumBasics;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverActionsDemo {
	WebDriver driver;
	String url;

	@Before
	public void setUp() throws Exception {
		url = "https://about.google/";

		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

	}

	@Test
	public void test() throws InterruptedException {
		
		WebElement mainelement = driver.findElement(By.xpath("//*[@id=\"glue-drawer\"]/div/div[1]/div/div"));
		Actions action = new Actions(driver);
		action.moveToElement(mainelement).perform();
		Thread.sleep(2000);
		WebElement belongingElement = driver.findElement(By.xpath("//a[@href=\"belonging/\"]"));
		action.moveToElement(belongingElement).click().perform();

	}

	@After
	public void tearDown() throws Exception {
		// driver.close();
	}

}
