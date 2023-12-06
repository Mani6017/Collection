package testNGWithKoushit;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LearnParameters {
	RemoteWebDriver driver;
	
	@Parameters({"emailId", "password", "browser"})
	@Test
	void logIn(String emailId, String password, String browser) throws InterruptedException {
		switch (browser) {
		case "chrome":
           driver = new ChromeDriver();
			break;
		case "edge":
           driver = new EdgeDriver();
			break;

		default:
			System.err.println("browser is not found");
			break;
		}
		driver.get("https://letcode.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.name("email")).sendKeys(emailId);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//button[.='LOGIN']")).click();
		Thread.sleep(1000);
		String title = driver.getTitle();
		Assert.assertEquals(title, "LetCode with Koushik");
		System.out.println("title is------- " + title);
		driver.quit();
	}
}
