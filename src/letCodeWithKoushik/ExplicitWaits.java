package letCodeWithKoushik;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaits {

	public static void main(String[] args) {
	    ChromeDriver driver = new ChromeDriver();
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();
		
		//invisibility
		driver.get("https://letcode.in/signin");
		driver.findElement(By.name("email")).sendKeys("Manikandan_9479@yahoo.com");
		driver.findElement(By.name("password")).sendKeys("Thusday!123");
	    driver.findElement(By.xpath("//button[text()='LOGIN']")).click();
	    WebElement icard = driver.findElement(By.xpath("//div[@aria-label=\"Welcome Manikandan\"]"));
	     wait.until(ExpectedConditions.invisibilityOf(icard));
	     driver.findElement(By.linkText("Sign out")).click();
	
	
	
//	    String text = driver.findElement(By.xpath("//div[@aria-label=\"Welcome Manikandan\"]")).getText();
//        System.out.println(text);
	
	
	
	
	
	
	
	
	
	
	
	
	
		//Explicity
		
		
//		driver.get("https://letcode.in/waits");
//		driver.findElement(By.id("accept")).click();
//		Alert until = wait.until(ExpectedConditions.alertIsPresent());
//		System.out.println(until.getText());
//		until.accept();
//		driver.switchTo().alert().accept();

		
		
		
	driver.quit();
	
	
	}

}
