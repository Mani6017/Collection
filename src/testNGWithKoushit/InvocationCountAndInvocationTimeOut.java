package testNGWithKoushit;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InvocationCountAndInvocationTimeOut {
	@Test(invocationCount = 3)
	public  void test1() {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("cricket", Keys.ENTER);
		//using contains should be xpath
		List<WebElement> crickets = 
				driver.findElements(By.xpath("//*[contains(text(),'cricket') or contains(text(),'Cricket')]"));
		System.out.println(crickets.size());
		driver.quit();
	}
	
//	@Test
//	public  void test2() {
//		ChromeDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//		driver.get("https://letcode.in/edit");
//		List<WebElement> labels = driver.findElements(By.tagName("label"));
//		// using collection its good for FOR each loop
//		WebElement lastElement = labels.get(labels.size()-1);
//		System.out.println(lastElement);
//		System.out.println("lastElement : " + lastElement.getText());
//		int size = labels.size();
//		if(size == 6) {
//			System.out.println(" Test case is passed ");
//		}else System.out.println(" failed ");
//		for (WebElement label : labels) {
//			String text = label.getText();
//			System.out.println(text);
//		}
//		driver.quit();
//	}

	
}
