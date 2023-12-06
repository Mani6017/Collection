package testNGWithKoushit;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class LearnAttributes4 {
	//expectedException, it will handle even test case filled and will come as passed case
	
	@Test(expectedExceptions = {NoSuchElementException.class})
	public  void test1() {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q1")).sendKeys("cricket", Keys.ENTER);
		//using contains should be xpath
		List<WebElement> crickets = 
				driver.findElements(By.xpath("//*[contains(text(),'cricket') or contains(text(),'Cricket')]"));
		System.out.println(crickets.size());
		driver.quit();
	}
	
	
//	// thread pool size, it should, only work with invocation count.
//	@Test(invocationCount = 3, threadPoolSize = 1)
//    public void findElements() {
//		ChromeDriver driver = new ChromeDriver();
//		EdgeDriver driver1 = new EdgeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//
//		driver.get("https://www.google.com/");
//		driver1.get("https://www.google.com/");
//
//		driver.findElement(By.name("q")).sendKeys("cricket", Keys.ENTER);
//		//using contains should be xpath
//		List<WebElement> crickets = 
//				driver.findElements(By.xpath("//*[contains(text(),'cricket') or contains(text(),'Cricket')]"));
//		System.out.println(crickets.size());
//		driver1.findElement(By.name("q")).sendKeys("cricket", Keys.ENTER);
//		//using contains should be xpath
//		List<WebElement> crickets1 = 
//				driver.findElements(By.xpath("//*[contains(text(),'cricket') or contains(text(),'Cricket')]"));
//		System.out.println(crickets1.size());
//		driver.quit();
//		driver1.quit();
//    }
	
}

