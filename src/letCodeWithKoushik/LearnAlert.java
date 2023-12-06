package letCodeWithKoushik;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/alert");
		//accept 
		driver.findElement(By.id("accept")).click();
		Alert alert = driver.switchTo().alert();
		String text =  alert.getText();
		System.out.println(text);
		alert.accept();
		
		//prompt
		driver.findElement(By.id("prompt")).click();
		driver.switchTo().alert();
		alert.sendKeys("mani");
		alert.accept();
		String text1 = driver.findElement(By.id("myName")).getText();
		System.out.println(text1);
		
		driver.close();
	}

}
