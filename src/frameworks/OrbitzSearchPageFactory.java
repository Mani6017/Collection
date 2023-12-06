package frameworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrbitzSearchPageFactory {
	public static WebElement element = null;
	
	WebDriver driver;
	@FindBy(xpath = "//input[@id= 'from0']//following-sibling::a[@class='suggestion-box__clear icon']")
	WebElement clearDepSugBox;
	
	@FindBy(xpath = "//input[@id='to0']//following-sibling::a[@class='suggestion-box__clear icon']")
	WebElement clearArrSugBox;
	
	@FindBy(id = "from0")
	WebElement depTextBox;
	
	@FindBy(id = "to0")
	WebElement arrTextBox;
	
	@FindBy(id = "cal0")
	WebElement depCalendarBox;
	
	@FindBy(xpath = "//div[@class= \"calendar__single-month active\"][position() =1]//a[@aria-label=\"30 October 2023\"]")
	WebElement chooseDepDate;
	
	@FindBy(xpath = "//div[@class= \"calendar__single-month active\"][position() =1]//a[@aria-label=\"31 October 2023\"]")
	WebElement chooseArrDate;
	
	@FindBy(id = "searchNow")
	WebElement searchNowButton;
	
	public OrbitzSearchPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void clearDepSuggestionBox() {
		// clear Dep suggestion box
	    clearDepSugBox.click();
	}
	
	public void clearArrSuggestionBox(){
		// clear Arrival suggestion box
		clearArrSugBox.click();		
		
	}
	
	
	public void  setDepAirport(String cityname) {
		depTextBox.sendKeys(cityname);
	}
	
	public void  setArrAirport(String cityname) {
		arrTextBox.sendKeys(cityname);
    }
	
	
	public  void chooseDepDates() throws InterruptedException {
		//choose Departure Date.
		depCalendarBox.click();
		Thread.sleep(3000);
		chooseDepDate.click();
	}
	
	public void chooseArrDates() {
		//choose arrival Date.
		chooseArrDate.click();
	}
	
	public void searchNow() {
		searchNowButton.click();
		
	}
			//choose Arrival Date.
			
			
			

}
