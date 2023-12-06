package seleniumBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonLocatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		cheapOAirLOcator(driver);
		//facebookLocator(driver);

	}
	
	public static void cheapOAirLOcator(WebDriver driver) {
		
        driver.get("https://www.cheapoair.com/");
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2)); // this method can do handling synchronization.
        
        //id
        driver.findElement(By.id("flights")).click();
        
        //xpath for (input type = "text")
        //driver.findElement(By.xpath("//input[@id=\"from0\"]")).sendKeys("Nashville");
        
        // # css. using id property #from0 or input#from0 or input[id = from0]
        
       driver.findElement(By.xpath("//input[@id= \"from0\"]/parent::div/section/preceding-sibling::a")).click();
       
       driver.findElement(By.cssSelector("#from0")).sendKeys("Nashville");
        
        // -------------using css for class property
        
        //div[class = "openjaw-holder custom-control custom-control-inline custom-checkbox pl-0 mt-0 mt-md-2"]
       //.openjaw-holder.custom-control.custom-control-inline.custom-checkbox.pl-0.mt-0 ----using dot append it
        //div.openjaw-holder.custom-control.custom-control-inline.custom-checkbox.pl-0.mt-0 ---im looking for dom .. class called using this method.
        //div[class ^= "openjaw-holder custom-control custom-control-inline custom-checkbox pl-0 mt-0 mt-md-2"] . this is wild card method using carrot symbol.
        // exact copy of class
        //div[class $= "md-2"] -----------using this method find the ending class.
        //div[class *= "mt-2"]-----------using this method it will match the another property
        
        //LinkText
        driver.findElement(By.linkText("Cars")).click();
        
        //PartialLinkTest
        //driver.findElement(By.partialLinkText("Ca")).click();
        
        //Tagname(It will match any of element, without specifying right property id)
        //driver.findElement(By.tagName("input")).sendKeys("Mani");
        
       //driver.findElement(By.cssSelector("#carFrom")).sendKeys("Nashville");// not works
        
       // driver.findElement(By.xpath("//input[@id=\"cal10\"]")).sendKeys("Oct 02");// not works
        
        //driver.findElement(By.xpath("//input[@id=\"cal11\"]")).sendKeys("Oct 03");// not works
        
        
        //className----sometimes it will not work. reason of multiple class inherit in one class----compound class cannot be applicable.
        //driver.findElement(By.className("btn btn-lg btn-block btn-default btn-search")).click();
       
        driver.findElement(By.xpath("//input[@class=\"btn btn-lg btn-block btn-default btn-search\"]")).click();
        
     // this is read the data.. we have to store by variable(retrive)
        String title = driver.findElement(By.className("banner__title")).getText(); 
        System.out.println(title);
        
	}
	public static void facebookLocator(WebDriver driver) {
		 
         driver.get("https://www.facebook.com/reg/?app_id=141101695993086&logger_id");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2)); // this method can do handling synchronization.
        
        driver.findElement(By.name("firstname")).sendKeys("Mani");
        
        driver.findElement(By.name("lastname")).sendKeys("Baskar");
        
        driver.findElement(By.name("reg_email__")).sendKeys("maddymani@gmail.com");
        
        
        //Link Texr
         driver.findElement(By.linkText("Already have an account?")).click();
         
         driver.findElement(By.name("email")).sendKeys("4122774998");
         
         driver.findElement(By.name("pass")).sendKeys("Friday!11");
         
         driver.findElement(By.id("loginbutton")).click();

	}


}
