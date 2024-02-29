package Assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Google_HandliingFrames {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.google.co.in/");

		//To click on Google Maps option
		driver.findElement(By.xpath("//a[@aria-label='Google apps']")).click();

		WebElement frame = driver.findElement(By.xpath("//iframe[@name='app']"));

		//To switch the control to framer
		driver.switchTo().frame(frame);

		//To click on Maps
		driver.findElement(By.xpath("//span[text()='Maps']")).click();
		Thread.sleep(2000);

		//To take the ScreenShots of the map
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dstn = new File("./screenshots/googleFrames.png");
		Files.copy(src, dstn);

		//To navigate back
		driver.navigate().back();
		

	}

}
