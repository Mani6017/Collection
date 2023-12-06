package letCodeWithKoushik;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlesFrames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://letcode.in/frame");
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//input[@name=\"fname\"]")).sendKeys("Mani");
        driver.findElement(By.name("lname")).sendKeys("baskar");
        driver.switchTo().frame(1);

         driver.findElement(By.name("email")).sendKeys("test@gmail.com");
        driver.switchTo().parentFrame();
        driver.findElement(By.xpath("//input[@name=\"fname\"]")).clear();
        driver.findElement(By.xpath("//input[@name=\"fname\"]")).sendKeys("Manikandan");
        
        driver.switchTo().parentFrame();
        Thread.sleep(2000);
        // some issue in frame
        driver.findElement(By.xpath("//a[text()='Watch tutorial']")).click();
        
        
	}

}
