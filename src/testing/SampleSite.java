package testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleSite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            ChromeDriver driver = new ChromeDriver();
            driver.get("https://signon.service-now.com/x_snc_sso_auth.do?pageId=username");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            driver.findElement(By.id("email")).sendKeys("maddymani727@gmail.com");
            driver.findElement(By.id("remember_username_label")).click();
            driver.findElement(By.xpath("//button[.='Next']")).click();
	}

}
