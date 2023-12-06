package seleniumBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicLocator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         WebDriver driver = new ChromeDriver();
         driver.get("https://www.facebook.com/reg/?app_id=141101695993086&logger_id");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2)); // this method can do handling synchronization.
        
        driver.findElement(By.name("firstname")).sendKeys("Mani");
        
        driver.findElement(By.name("lastname")).sendKeys("Baskar");
        
        driver.findElement(By.name("reg_email__")).sendKeys("maddymani@gmail.com");
        
        
        //Link Texr
         driver.findElement(By.linkText("Already have an account?")).click();
         
         driver.findElement(By.name("email")).sendKeys("4122774998");
         
         driver.findElement(By.name("pass")).sendKeys("Friday!11");
         
         driver.findElement(By.id("loginbutton")).click();

         
         
	}

}
