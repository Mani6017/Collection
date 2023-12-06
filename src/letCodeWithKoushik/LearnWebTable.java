package letCodeWithKoushik;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LearnWebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://letcode.in/table");
//		WebElement table = driver.findElement(By.id("shopping"));
//		List<WebElement> headers = table.findElements(By.tagName("th"));
//		for (WebElement header : headers) {
//			String text = header.getText();
//			System.out.println(text);
//		}
//		
//		System.out.println("-----------");
//		List<WebElement> allrows = table.findElements(By.cssSelector("tbody tr"));
//		int size = allrows.size();
//		System.out.println("allrows" + size);
//		if(size == 3) {
//			System.out.println("passed");
//		}else {
//			System.out.println("failed");
//		}
//		for (WebElement allrow : allrows) {
//			System.out.println(allrow.getText());
//		}
//		
//		for (WebElement row : allrows) {
//			List <WebElement> column = row.findElements(By.tagName("td"));
//			WebElement  firstcolumn =  column.get(0);
//			System.out.println("first column " + firstcolumn.getText());
//		}
		
		//table2
		WebElement table2 = driver.findElement(By.id("simpletable"));
		List<WebElement> headers2 = table2.findElements(By.tagName("th"));
		for (WebElement header2 : headers2) {
			System.out.println("table 2 header " + header2.getText());
		}
		System.out.println("-------------checking size of teable 2 header");
		int headersize = headers2.size();
		if (headersize == 4 ) {
			System.out.println("read header");
		}else {
			System.out.println("cannot read header");
		}
		
		System.out.println("---------read table 2 body----");
		List<WebElement> allrows2 = table2.findElements(By.cssSelector("tbody tr"));
		for (WebElement allrow2 : allrows2) {
			System.out.println(allrow2.getText());
			
		}
		System.out.println("---------first column------");
		/*for (WebElement allcolumn : allrows2) {
			List<WebElement> column = allcolumn.findElements(By.tagName("td"));
			WebElement firstColumn = column.get(0);
			System.out.println(firstColumn.getText());*/
		//}
	     for (int i= 0; i<headersize; i++) {
	    	 List<WebElement> rows = allrows2.get(i).findElements(By.tagName("td"));
	    	 WebElement firstRow = rows.get(1);
	    	 System.out.println(firstRow.getText());
	     }
		
		
		driver.quit();
		
	}

}
