package TestNGExecution;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization {

	static WebDriver driver;

	@Parameters({"browser","url","Vusername","Vpassword"})
	@Test
	public void validLogin(String bname, String url, String usn, String pwd) throws InterruptedException {
		if (bname.equalsIgnoreCase("chrome")) {

			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get(url);
			Thread.sleep(1000);

			driver.findElement(By.name("username")).sendKeys(usn);
			Thread.sleep(1000);
			driver.findElement(By.name("pwd")).sendKeys(pwd);
			Thread.sleep(1000);
			driver.findElement(By.id("loginButton")).click();

		} else if (bname.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get(url);
			Thread.sleep(1000);

			driver.findElement(By.name("username")).sendKeys(usn);
			Thread.sleep(1000);
			driver.findElement(By.name("pwd")).sendKeys(pwd);
			Thread.sleep(1000);
			driver.findElement(By.id("loginButton")).click();

		}else if(bname.equalsIgnoreCase("edge"))
		{
			driver= new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get(url);
			Thread.sleep(1000);
			
			driver.findElement(By.name("username")).sendKeys(usn);
			Thread.sleep(1000);
			driver.findElement(By.name("pwd")).sendKeys(pwd);
			Thread.sleep(1000);
			driver.findElement(By.id("loginButton")).click();
			
			
			
			
		}
		

		

	}
}
