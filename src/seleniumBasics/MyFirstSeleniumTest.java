package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class MyFirstSeleniumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriver chromeDriver = new ChromeDriver();
       //System.setProperty("webdriver.chrome.driver", "C:\\Users\\maddy\\MyNewWorkSpace\\drivers\\chromedriver.exe");
        chromeDriver.get("http://www.youtube.com");
        
        WebDriver edgeDriver = new EdgeDriver();
        //System.setProperty("webdriver.edge.driver", "C:\\Users\\maddy\\MyNewWorkSpace\\drivers\\msedgedriver.exe");
        edgeDriver.get("http://www.dmvpa.com");
        }

}
