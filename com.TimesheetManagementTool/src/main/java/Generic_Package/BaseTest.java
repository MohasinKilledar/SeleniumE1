package Generic_Package;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.google.common.io.Files;

public class BaseTest implements IAutoConstant {

	public static WebDriver driver;

	
	@BeforeMethod
	public void setUp() throws IOException {

		Flib lib = new Flib();

		String browser = lib.getDataFromProperty(PROP_PATH, "browser");

		if (browser.equalsIgnoreCase("chrome")) {

			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();

		} else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();

		} else {
			System.out.println("Invalid Browser");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Time_Outs));
		String url = lib.getDataFromProperty(PROP_PATH, "url");
		driver.get(url);

	}
	
	
	public void failedMethodSS(String failedMethod)
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dst = new File(SCREENSHOT_PATH+failedMethod+".png");
		
		try {
			Files.copy(src, dst);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
