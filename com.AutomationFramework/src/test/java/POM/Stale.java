package POM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Stale {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(" http://127.0.0.1/login.do;jsessionid=724patsq59mar");
		
		WebElement usn = driver.findElement(By.name("username"));
	//	usn.sendKeys("admin");
		WebElement pwd = driver.findElement(By.name("pwd"));
	//	pwd.sendKeys("admin");
		WebElement loginbtn = driver.findElement(By.id("loginButton"));
		
		Thread.sleep(2000);
		
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		usn.sendKeys("admin");
		

	}

}
