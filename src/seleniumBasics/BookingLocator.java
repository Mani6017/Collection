package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookingLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         WebDriver driver = new ChromeDriver();
         bookingLocator(driver);
	}
    public static void bookingLocator(WebDriver driver) {
    	    driver.get("https://www.booking.com/");
    	    driver.manage().window().maximize();
    	   driver.findElement(By.className("eb46370fe1")).sendKeys("nashville");
    }
}
