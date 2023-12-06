package seleniumBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicLocator {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         WebDriver driver = new ChromeDriver();
         driver.get("https://www.cheapoair.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4)); // this method can do handling synchronization.
         
         //id
         driver.findElement(By.id("flights")).click();
         
         //xpath for (input type = "text")
         driver.findElement(By.xpath("//input[@id=\"from0\"]")).sendKeys("Nashville");
         
         //LinkText
         driver.findElement(By.linkText("Cars")).click();
         
         //PartialLinkTest
         //driver.findElement(By.partialLinkText("Ca")).click();
         
         //Tagname(It will match any of element, without specifying right property id)
         //driver.findElement(By.tagName("input")).sendKeys("Mani");
         
         driver.findElement(By.id("carFrom")).sendKeys("Nashville");// not works
         
        // driver.findElement(By.xpath("//input[@id=\"cal10\"]")).sendKeys("Oct 02");// not works
         
         //driver.findElement(By.xpath("//input[@id=\"cal11\"]")).sendKeys("Oct 03");// not works
         
         
         //className----sometimes it will not work. reason of multiple class inherit in one class----compound class cannot be applicable.
         //driver.findElement(By.className("btn btn-lg btn-block btn-default btn-search")).click();
        
         driver.findElement(By.xpath("//input[@class=\"btn btn-lg btn-block btn-default btn-search\"]")).click();
         
      // this is read the data.. we have to store by variable(retrive)
         String title = driver.findElement(By.className("banner__title")).getText(); 
         System.out.println(title);
         
         
         
         
	}

}
