package frameworks;

//import static org.junit.Assert.*;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import frameworks.OrbitzSearchPageFactory;

public class PageObjectFactory {
	WebDriver driver;
    String baseURL;
    OrbitzSearchPageFactory OrbitzSearchPage;
	@Before
	public void setUp() throws Exception {
		 baseURL= "https://www.cheapoair.com/";

		 driver = new ChromeDriver();
		 driver.get(baseURL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Thread.sleep(2000);
		OrbitzSearchPage = new OrbitzSearchPageFactory(driver);
	}
	
	@Test
	public void test() throws InterruptedException {
		
		OrbitzSearchPage.clearDepSuggestionBox();
		OrbitzSearchPage.setDepAirport("Columbus");
		OrbitzSearchPage.clearArrSuggestionBox();
		OrbitzSearchPage.setArrAirport("Pittsburgh");
		OrbitzSearchPage.chooseDepDates();
		OrbitzSearchPage.chooseArrDates();
		OrbitzSearchPage.searchNow();
		
		
		//String resultFound = OrbitzSearchResultsPage.filterResults(driver).getText();
		//System.out.println(resultFound);
		
		
	}
	public void secondTest() throws InterruptedException {
		OrbitzSearchPage.clearDepSuggestionBox();
		OrbitzSearchPage.setDepAirport("Nashville");
		OrbitzSearchPage.clearArrSuggestionBox();
		OrbitzSearchPage.setArrAirport("Pittsburgh");
		OrbitzSearchPage.chooseDepDates();
		OrbitzSearchPage.chooseArrDates();
		OrbitzSearchPage.searchNow();
		
		//String resultFound = OrbitzSearchResultsPage.filterResults(driver).getText();
		//System.out.println(resultFound);
		
		
	}


	@After
	public void tearDown() throws Exception {
	}

	
}
