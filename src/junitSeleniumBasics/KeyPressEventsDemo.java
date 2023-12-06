package junitSeleniumBasics;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyPressEventsDemo {
	WebDriver driver;
	String url;

	@Before
	public void setUp() throws Exception {
		url = "https://www.cheapoair.com/giftcards/";

		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

	}

	@Test
	public void test() throws InterruptedException {
		//driver.findElement(By.linkText("My Bookings")).sendKeys(Keys.CONTROL + "a");
		
		driver.findElement(By.linkText("My Bookings")).sendKeys(Keys.chord(Keys.CONTROL + "a"));
		
//		WebElement bookingElement = driver.findElement(By.linkText("My Bookings"));
//		bookingElement.click();
//		driver.findElement(By.name("email")).sendKeys("Mani@test.com");
//		driver.findElement(By.xpath("//button[text()=\"Next\"]")).click();
//		Thread.sleep(2000);

//		WebElement firstNameField = driver.findElement(By.name("firstName"));
//		firstNameField.sendKeys("Mani");
//		firstNameField.sendKeys(Keys.TAB);
//		
//		WebElement lastNameField = driver.findElement(By.name("lastName"));
//		lastNameField.sendKeys("b");
//		lastNameField.sendKeys(Keys.TAB);
//		driver.findElement(By.name("password")).sendKeys(Keys.ENTER);
	
	}

	@After
	public void tearDown() throws Exception {
		// driver.close();
	}

}
