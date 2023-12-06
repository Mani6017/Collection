package testNGWithKoushit;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LearnWindowHandling {
	@Test
	public  void windowHandles() {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://letcode.in/windows");
		String firstWindow = driver.getWindowHandle();
		System.out.println("firstWindow" + firstWindow);
		driver.findElement(By.id("home")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println("windowHandles :" + windowHandles);
		List<String> list = new ArrayList<String>(windowHandles);
		driver.switchTo().window(list.get(1));
		System.out.println(driver.getCurrentUrl());
		driver.switchTo().window(list.get(0));
		driver.close();
		Set<String> windowHandles2 = driver.getWindowHandles();
		list.clear();
		list.addAll(windowHandles2);
		driver.switchTo().window(list.get(0));
		System.out.println(driver.getCurrentUrl());
		driver.quit();
	}

}
