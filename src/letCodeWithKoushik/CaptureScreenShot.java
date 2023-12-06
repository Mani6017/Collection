package letCodeWithKoushik;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CaptureScreenShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/buttons");
		File fromSrc = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./snaps/img.png");
		FileHandler.copy(fromSrc, dest);
		
		WebElement ele = driver.findElement(By.id("home"));
		File buttonEle = ele.getScreenshotAs(OutputType.FILE);
		File dest1 = new File("./snaps/img1.png");
		FileHandler.copy(buttonEle, dest1);
		
		WebElement section = driver.findElement
				(By.xpath("/html/body/app-root/app-buttons/section[1]/div/div/div[2]/app-learning-point/div/div"));
		File sec = section.getScreenshotAs(OutputType.FILE);
		File dest2 = new File("./snaps/img2.png");
		FileHandler.copy(sec, dest2);
		driver.close();
	}

}
