package junitSeleniumBasics;

import java.io.File;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class TakeScreenshotDemo {
	WebDriver driver;
	String baseURL;

	@Before
	public void setUp() throws Exception {
		baseURL = "https://www.cheapoair.com/";

		driver = new ChromeDriver();
		driver.get(baseURL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@Test
	public void testAutoCompleteAndCalendar() throws InterruptedException {

		selectDepAirport();
		selectDepCalendar();
		
		/*
		 * calender element ----method
		 *1.  //div[@class="calendar__single-month active"][position() = 1]//a[@aria-label="30 October 2023"]
		 *2.  //div[@class="calendar__single-month active"][position() = 1]//a[text()="30"]
		 *
		 *
		 */
	}
	private void selectDepCalendar() throws InterruptedException {
		System.out.println(" Running -------selectDepCalendar()");

		driver.findElement(By.id("cal0")).click();
		WebElement depCalendarMonth = driver.findElement(By.xpath("//div[@class=\"calendar__single-month active\"][position() = 1]"));
		List<WebElement> allValidDateElements = depCalendarMonth.findElements(By.tagName("a"));

		for (WebElement eachDateElement : allValidDateElements) {
			if (eachDateElement.getText().equals("30")) {
				Thread.sleep(1000);
				System.out.println("Found the Dep Date click now: ");
				eachDateElement.click();
				break;
			}
		}
	}

	private void selectDepAirport() throws InterruptedException {
		System.out.println(" Running -------selectDepAirport()");

		WebElement flightstab = driver.findElement(By.id("flights"));

		
		flightstab.click();
		// clear suggestion box x
		driver.findElement(By.xpath("//input[@id= \"from0\"]/parent::div/section/preceding-sibling::a")).click();
		driver.findElement(By.cssSelector("#from0")).sendKeys("columbus");

		WebElement ulelement = driver.findElement(By.xpath("//div[@class=\"suggestion-box__content air is-visible\"]//ul"));
		List<WebElement> allLielement = ulelement.findElements(By.tagName("li"));

		for (WebElement tagelement : allLielement) {
			System.out.println("get all li element " + tagelement.getText());
			if (tagelement.getText().contains("GTR")) {
				Thread.sleep(1000);
				System.out.println("Found the airport click now: ");
				tagelement.click();
				break;
			}
		}
	}

	@After
	public void tearDown() throws Exception {
		//driver.close();
		//String fileName = "Screenshots.png";
		String fileName = getRandomString(5)+ ".png";
		System.out.println(fileName);
		String directory = System.getProperty("user.div")+ "//screenshots//";
		File  sourceFile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourceFile, new File(directory + fileName));
		driver.quit();
		driver.close();
		
	}
	
	public static String getRandomString(int length) {
		StringBuilder randomString = new StringBuilder();
		String characters = "abcdefghjiklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890&@%$" ;
		for (int i = 0; i<length; i++) {
			int index = (int) (Math.random()* characters.length());
			randomString.append(characters.charAt(index));
		}
		return randomString.toString();
		
	}

}
