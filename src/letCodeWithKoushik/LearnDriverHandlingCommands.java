package letCodeWithKoushik;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnDriverHandlingCommands {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
          ChromeDriver driver = new ChromeDriver();
          driver.get("https://letcode.in/buttons");
          String url = driver.getCurrentUrl();
          System.out.println("button page url " + url);
          Thread.sleep(2000);
          driver.findElement(By.xpath("//button[.='Goto Home']")).click();
          String url1 = driver.getCurrentUrl();
          System.out.println("home page url " + url1);
          
          driver.navigate().back();
          System.out.println("returns to buttons page " + driver.getCurrentUrl());
          driver.navigate().refresh();
          driver.navigate().to("https://letcode.in/signin");
          System.out.println(driver.getCurrentUrl());
          
          driver.navigate().forward();
          driver.navigate().to("https://www.facebook.com/");
       
          driver.quit();
	}

}
