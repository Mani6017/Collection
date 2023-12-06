package testNGWithKoushit;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utilities.DataUtils;

public class LearnDataProvider {
	WebDriver driver;
	String baseUrl; 
	
//    @DataProvider(name = "login")
//	public String[][] getData() {
//		String[][] data = new String[2][2];
//		data[0][0] = "Manikandan_9479@yahoo.com";
//		data[0][1] = "Thusday!123";
//		
//		data[1][0] = "Maddymani727@gmail.com";
//		data[1][1] = "Mani@1994";
//		
//		return data;
//	}
	
	// we cannot use at one time for parameter and data provider, it will throw data provider mismatch 
//	@Parameters({"emailID"})
	@Test(dataProvider = "login", dataProviderClass = DataUtils.class)
	void login(String data[]) {
		//System.out.println(emailID);
		System.out.println(data[0]);
		System.out.println(data[1]);
		driver = new ChromeDriver();
		baseUrl = "https://letcode.in/";
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get(baseUrl);
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.name("email")).sendKeys(data[0]);
		driver.findElement(By.name("password")).sendKeys(data[1]);
		driver.findElement(By.xpath("//button[.='LOGIN']")).click();
		String url = driver.getCurrentUrl();
		System.out.println("title is " + url);
		Assert.assertEquals(url, "https://letcode.in/signin");
		driver.quit();
	}
}
