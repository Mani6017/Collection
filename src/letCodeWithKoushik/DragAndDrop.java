package letCodeWithKoushik;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
    ChromeDriver driver;
    Actions builder;
    public static void main(String[] args) {
    	
    	DragAndDrop cons = new DragAndDrop();
    	cons.dragAndDrop();
    	cons.dragAndDropBy();
	}
	public  void dragAndDrop() {
		// TODO Auto-generated method stub
	    driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.switchTo().frame(0);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		builder = new Actions(driver);
		builder.dragAndDrop(source, target).perform();
		driver.quit();
	}
	
	     void dragAndDropBy() {
	    driver = new ChromeDriver();
        driver.get("https://jqueryui.com/draggable/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.switchTo().frame(0);
		WebElement ele = driver.findElement(By.id("draggable"));
		builder = new Actions(driver);
		int x = ele.getLocation().getX();
		int y = ele.getLocation().getY();

		builder.dragAndDropBy(ele, x+45, y+75).perform();
		
		driver.close();
	}

}
