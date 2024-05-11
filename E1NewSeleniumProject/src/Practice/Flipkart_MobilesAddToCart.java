package Practice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Flipkart_MobilesAddToCart {

	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com/");
		String parentwdwTitle = driver.getTitle();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mobiles", Keys.ENTER);
		driver.findElement(By.xpath("//div[text()='vivo T3x 5G (Crimson Bliss, 128 GB)']")).click();
		
		

		Set<String> allwindows = driver.getWindowHandles();

		for (String aw : allwindows) {
			String title = driver.switchTo().window(aw).getTitle();

			if (!title.equals(parentwdwTitle)) {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,2000)");
				TakesScreenshot ts = (TakesScreenshot) driver;
				File src = ts.getScreenshotAs(OutputType.FILE);
				File dest = new File("./screenshots/mobiles.jpg");
				Files.copy(src, dest);
				driver.close();

			}

		}

	}

}
