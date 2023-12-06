package letCodeWithKoushik;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnHandlingInputs {
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://letcode.in/edit");
	// Enter your full name
	driver.findElement(By.id("fullName")).sendKeys("Manikandan Baskar");
	//Append a text and press keyboard tab
	driver.findElement(By.id("join")).sendKeys(" in programing", Keys.TAB);
	//what is inside the text box
	String value = driver.findElement(By.id("getMe")).getAttribute("value");
	System.out.println(value);
	//clear the text
	driver.findElement(By.id("clearMe")).clear();
	//confirm edit field id disabled
	boolean isEdit = driver.findElement(By.id("noEdit")).isEnabled();
	System.out.println(isEdit);
	//confirm text is readonly
	String dontWrite = driver.findElement(By.id("dontwrite")).getAttribute("value");
	System.out.println(dontWrite);
	
	driver.quit();
}
}
