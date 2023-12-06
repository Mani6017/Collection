package letCodeWithKoushik;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextAndGetAttribute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/edit");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		// get text
	    WebElement ele =	driver.findElement(By.tagName("h1"));
	    String text = ele.getText();
	    System.out.println(text);
	    
	    String text2 = driver.findElement(By.linkText("Sign up")).getText();
	    System.out.println(text2);
	    
	    String cardcontent = driver.findElement(By.xpath("//div[@class=\"card-content\"]")).getText();
	    System.out.println(cardcontent);

	    //getAttribute
	    String attri =	driver.findElement(By.id("fullName")).getAttribute("placeholder");
	    System.out.println(attri);
	    driver.quit();
	}

}
