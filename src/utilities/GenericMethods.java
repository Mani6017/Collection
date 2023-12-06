package utilities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class  GenericMethods{
      WebDriver driver;
      
      
      public GenericMethods(WebDriver driver) {
    	  this.driver = driver;
      }
	
	
	//getElement("flights", "ID")
	public WebElement getElement(String locator, String type) {
		type = type.toLowerCase();
		if (type.equals("id")) {
			System.out.println("element found with id " + locator);
			return this.driver.findElement(By.id(locator));
		} else if (type.equals("xpath")) {
			System.out.println("element found with xpath " + locator);
			return this.driver.findElement(By.xpath(locator));
		}else if(type.equals("css")) {
			System.out.println("element found with css " + locator);
			return this.driver.findElement(By.xpath(locator));
			
		}else if(type.equals("linktext")) {
			System.out.println("element found with linktext " + locator);
			return this.driver.findElement(By.linkText(locator));
			
		}else if(type.equals("partiallinktext")) {
			System.out.println("element found with partiallinktext " + locator);
			return this.driver.findElement(By.partialLinkText(locator));
		}
		else {
			System.out.println("Locator not supported ");
			return null;
		}

	}

	//ListElements
	public List <WebElement> getElementList(String locator, String type) {
		type = type.toLowerCase();
		if (type.equals("id")) {
			System.out.println("element found with id " + locator);
			return this.driver.findElements(By.id(locator));
		} else if (type.equals("xpath")) {
			System.out.println("element found with xpath " + locator);
			return this.driver.findElements(By.xpath(locator));
		}else if(type.equals("css")) {
			System.out.println("element found with css " + locator);
			return this.driver.findElements(By.xpath(locator));
			
		}else if(type.equals("linktext")) {
			System.out.println("element found with linktext " + locator);
			return this.driver.findElements(By.linkText(locator));
			
		}else if(type.equals("partiallinktext")) {
			System.out.println("element found with partiallinktext " + locator);
			return this.driver.findElements(By.partialLinkText(locator));
		}
		else {
			System.out.println("Locator not supported ");
			return null;
		}

	}

    public boolean  isElementPresent(String locator, String type) {
    
    	List<WebElement> elementlist = getElementList(locator, type);
    	if(elementlist.size() > 0) {
    		return true;
    	}else {
    		return false;
    	}
    }

	

}
