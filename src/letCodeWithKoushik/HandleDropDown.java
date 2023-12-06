package letCodeWithKoushik;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/dropdowns");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		WebElement fruits = driver.findElement(By.cssSelector("#fruits"));
		Select myFruit = new Select(fruits);
		myFruit.selectByVisibleText("Apple");
		WebElement printText = driver.findElement(By.xpath("//p[.='You have selected Apple']"));
        System.out.println(printText.getText());
        System.out.println("mltiple? " + myFruit.isMultiple());
        
        
        WebElement country = driver.findElement(By.cssSelector("#country"));
		Select nation = new Select(country);
		nation.selectByValue("Argentina");
		WebElement fo = nation.getFirstSelectedOption();
		System.out.println(fo.getText());
		
        WebElement heros = driver.findElement(By.cssSelector("#superheros"));
		Select myheros = new Select(heros);
		boolean multiple = myheros.isMultiple();
		System.out.println("mltiple? " + multiple);
		myheros.selectByIndex(0);
		myheros.deselectByValue("ca");
		
		driver.quit();
	}

}
