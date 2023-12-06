package practiceTestNG;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_ScreenshotOnFailure {
	WebDriver driver;
	String baseUrl;

	@BeforeMethod
	public void setUP() {
		driver = new ChromeDriver();
		baseUrl = "https://www.cheapoair.com/";
		driver.manage().window().maximize();
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	}

	@Test
	public void homePagetest() {
		System.out.println("passing test ----homepage banner text");
		String banner = driver.findElement(By.xpath("//h1[@class=\"banner__title\"]")).getText();
		Assert.assertEquals(banner, "Compare and Book Cheap Flights on Over 500 Airlines");
	}
	
	@Test
	public void homePagetest2() {
		System.out.println("failing test ----homepage banner text");
		String banner = driver.findElement(By.xpath("//h1[@class=\"banner__title\"]")).getText();
		Assert.assertEquals(banner, "Compare and Book Cheap Flights on Over 500 Airlinessss");
	}


	@AfterMethod
	public void afterMethod(ITestResult testResult) throws IOException {
		
		if(testResult.getStatus() == ITestResult.FAILURE) {
			System.out.println("Failed " + testResult.getName());
		String fileName = getRandomString(7) + ".png";
		System.out.println(fileName);
		String directory = System.getProperty("user.div") + "//screenshots//";
		File sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourceFile, new File(directory + fileName));
		driver.quit();
		// driver.close();
		}

	}

	public static String getRandomString(int length) {
		StringBuilder randomString = new StringBuilder();
		String characters = "abcdefghjiklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890&@%$";
		for (int i = 0; i < length; i++) {
			int index = (int) (Math.random() * characters.length());
			randomString.append(characters.charAt(index));
		}
		return randomString.toString();

	}

}
