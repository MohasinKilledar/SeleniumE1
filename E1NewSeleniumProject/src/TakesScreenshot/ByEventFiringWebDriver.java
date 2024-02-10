package TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class ByEventFiringWebDriver {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();//To upcast to WebDriver Interface
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.youtube.com/");

		EventFiringWebDriver efwd = new EventFiringWebDriver(driver);// To create the object of EventFiringWebDriver class and pass driver reference variable.

		File src = efwd.getScreenshotAs(OutputType.FILE);// To take the screenshot of the webpage

		File dstn = new File("./screenshots/YouTube.png");// To specify the location , name and extension of screenshot

		Files.copy(src, dstn);//  To copy and paste the screenshot into screenshots folder.


	}

}
