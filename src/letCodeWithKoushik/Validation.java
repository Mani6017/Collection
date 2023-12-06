package letCodeWithKoushik;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		//isDisplayed - used to check if the element is visible or rendered
		boolean displayed = driver.findElement(By.linkText("Log in")).isDisplayed();
		System.out.println("isdisplayed? " + displayed);
		
		//isEnabled - if the element is intractable
		 driver.navigate().to("https://letcode.in/edit");
		boolean enabled = driver.findElement(By.cssSelector("#noEdit")).isEnabled();
		System.out.println("isEnabled? " + enabled);
		 driver.navigate().to("https://letcode.in/radio");
		//isSelected - if the element is checked by radio or tick mark
		boolean radio = driver.findElement
		(By.xpath("/html/body/app-root/app-radio-check/section[1]/div/div/div[1]/div/div/div[6]/label[2]/input")).isSelected();
		System.out.println(radio);
		driver.quit();
	}

}
