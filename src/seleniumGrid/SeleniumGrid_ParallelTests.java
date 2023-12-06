package seleniumGrid;


import java.net.URL;
import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SeleniumGrid_ParallelTests {
	private WebDriver driver;
	private String url;
	private String nodeUrl;
	@BeforeClass
	public void setUp() throws Exception {
		nodeUrl = "http://192.168.1.225:4444";

		//driver = new ChromeDriver();
		url = "https://www.cheapoair.com/";

		//selenium grid properties
		DesiredCapabilities caps = new DesiredCapabilities();

		caps.setBrowserName("chrome");
		//caps.setBrowserName("firefox");

		caps.setPlatform(Platform.WINDOWS);
		driver = new RemoteWebDriver(new URL(nodeUrl), caps);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get(url);
		Thread.sleep(3000);
	}

	@Test
	public void logoTest() {
		System.out.println("logo-----@test");
		boolean logo = driver.findElement(By.xpath("//a[@class=\"brand-logo-icon\"]")).isDisplayed();
		Assert.assertTrue(logo);
		System.out.println(logo);
	}

	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}




}
