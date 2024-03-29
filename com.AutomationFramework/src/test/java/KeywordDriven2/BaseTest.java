package KeywordDriven2;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest implements IAuto {

	public static WebDriver driver;

	public void setUp() throws IOException 
	{
		Flib lib = new Flib();
		String browser = lib.getPropertyData(Prop_Path, "browser");

		if (browser.equals("chrome")) {

			driver = new ChromeDriver();

		} else if (browser.equals("firefox")) {

			driver = new FirefoxDriver();

		} else if (browser.equals("edge")) {

			driver = new EdgeDriver();

		}
		else
		{
			System.out.println("Invalid Browser");
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Time_Outs));
		String url = lib.getPropertyData(Prop_Path, "url");
		driver.get(url);
		

	}
	
	public void teardown()
	{
		driver.quit();
	}
}
