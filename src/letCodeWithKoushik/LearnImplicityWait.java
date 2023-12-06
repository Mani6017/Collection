package letCodeWithKoushik;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LearnImplicityWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		//ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.name("email")).sendKeys("Manikandan_9479@yahoo.com");
		driver.findElement(By.name("password")).sendKeys("Thusday!123");
		driver.findElement(By.xpath("//button[.='LOGIN']")).click();
        driver.quit();
	}

}
