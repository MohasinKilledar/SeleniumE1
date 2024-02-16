package JavascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PerformHorizontalScrollingOperation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://omayo.blogspot.com/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(400,0)");// To scroll right side
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(-200,0)");// To scroll left side
		Thread.sleep(2000);
		driver.close();
		

	}

}
