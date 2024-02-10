package TakesScreenshot;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class ByUpcastingintoRemoteWebDriver {

	public static void main(String[] args) throws IOException {
		RemoteWebDriver driver = new ChromeDriver();// To store the reference with RemoteWebdriver class
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.makemytrip.com/");
		
		
		
		
		File src = driver.getScreenshotAs(OutputType.FILE);// To take the screenshot of WebPAge
		
		 File dest = new File("./screenshots/Makemytrip.jpg");// To specify the location, name and extension of screenshot
		 
		 Files.copy(src, dest);//  To copy and paste the screenshot into screenshots folder.
		
		
		

	}

}
