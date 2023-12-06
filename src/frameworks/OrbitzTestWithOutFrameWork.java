package frameworks;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrbitzTestWithOutFrameWork {
       WebDriver driver;
       String baseURL;
	@Before
	public void setUp() throws Exception {
		 baseURL= "https://www.cheapoair.com/";

		 driver = new ChromeDriver();
		 driver.get(baseURL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Thread.sleep(2000);
	}
	
	@Test
	public void test() throws InterruptedException {
		
		// clear Dep suggestion box
		WebElement clearDepSugBox = driver.findElement(By.xpath("//input[@id=\"from0\"]//following-sibling::a[@class=\"suggestion-box__clear icon\"]"));
		clearDepSugBox.click();
		
		driver.findElement(By.id("from0")).sendKeys("columbus");
		
		// clear Arrival suggestion box
		WebElement clearArrSugBox = driver.findElement(By.xpath("//input[@id=\"to0\"]//following-sibling::a[@class=\"suggestion-box__clear icon\"]"));
		clearArrSugBox.click();
		
		driver.findElement(By.id("to0")).sendKeys("chicago");
		
		//clicking on departure calendar edit box
		WebElement depCalEdit = driver.findElement(By.id("cal0"));
		depCalEdit.click();
		
		
		Thread.sleep(3000);
		//choose Departure Date.
		WebElement chooseDeparture = driver.findElement(By.xpath("//div[@class= \"calendar__single-month active\"][position() =1]//a[@aria-label=\"30 October 2023\"]"));
		chooseDeparture.click();
		
		
		
		//choose Arrival Date.
		
		WebElement ArrivalDeparture = driver.findElement(By.xpath("//div[@class= \"calendar__single-month active\"][position() =1]//a[@aria-label=\"31 October 2023\"]"));
		ArrivalDeparture.click();
		
		driver.findElement(By.id("searchNow")).click();
		
//		Thread.sleep(10000);
//		String resultFound = driver.findElement(By.xpath("//div[@class=\"filters--content col-12 p-0\"]")).getText();
//		System.out.println(resultFound);
//		
	}
	
	@Test
	public void SecondTest() throws InterruptedException {
		
		// clear Dep suggestion box
		WebElement clearDepSugBox = driver.findElement(By.xpath("//input[@id=\"from0\"]//following-sibling::a[@class=\"suggestion-box__clear icon\"]"));
		clearDepSugBox.click();
		
		driver.findElement(By.id("from0")).sendKeys("cleveland");
		
		// clear Arrival suggestion box
		WebElement clearArrSugBox = driver.findElement(By.xpath("//input[@id=\"to0\"]//following-sibling::a[@class=\"suggestion-box__clear icon\"]"));
		clearArrSugBox.click();
		
		driver.findElement(By.id("to0")).sendKeys("chicago");
		
		//clicking on departure calendar edit box
		WebElement depCalEdit = driver.findElement(By.id("cal0"));
		depCalEdit.click();
		
		
		Thread.sleep(3000);
		//choose Departure Date.
		WebElement chooseDeparture = driver.findElement(By.xpath("//div[@class= \"calendar__single-month active\"][position() =1]//a[@aria-label=\"30 October 2023\"]"));
		chooseDeparture.click();
		
		
		
		//choose Arrival Date.
		
		WebElement ArrivalDeparture = driver.findElement(By.xpath("//div[@class= \"calendar__single-month active\"][position() =1]//a[@aria-label=\"31 October 2023\"]"));
		ArrivalDeparture.click();
		
		driver.findElement(By.id("searchNow")).click();
		
//		Thread.sleep(10000);
//		String resultFound = driver.findElement(By.xpath("//div[@class=\"filters--content col-12 p-0\"]")).getText();
//		System.out.println(resultFound);
//		
	}

	@After
	public void tearDown() throws Exception {
		//driver.close();
	}


}
