package letCodeWithKoushik;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingButtons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/buttons");
		//        get x & y co-ordinates
		WebElement ele = driver.findElement(By.id("position"));
		Point point = ele.getLocation();
		int x = point.getX();
		int y = point.getY();
		System.out.println("x=> " + x + "-------" + "y=> " + y);
		//        find the color of the button
		WebElement btncolor = driver.findElement(By.id("color"));
		String colorid = btncolor.getCssValue("background-color");
		System.out.println(colorid);
		//        find the height & width of the button
		Rectangle rect  = driver.findElement(By.id("property")).getRect();
		Point pointHiWi = rect.getPoint();
		System.out.println("hi and wi for point " + pointHiWi);
		Dimension di = rect.getDimension();
		int hi = di.getHeight();
		int wi = di.getWidth();
		System.out.println("dimension -----hi " + hi + " and wi " + wi );
		//        confirm button is disabled
		boolean disabled = driver.findElement(By.id("isDisabled")).isEnabled();
		System.out.println(disabled);
		//        click and hold button
         boolean lastButton = driver.findElement(By.xpath("//*[@id=\"isDisabled\"]/div/h2")).isEnabled();
         System.out.println(lastButton);
		driver.quit();
	}

}
