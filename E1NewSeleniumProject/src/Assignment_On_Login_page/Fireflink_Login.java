package Assignment_On_Login_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Fireflink_Login {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://app.fireflink.com/signin");
		Thread.sleep(2000);
		
		WebElement email = driver.findElement(By.cssSelector("input[ name = 'emailId']"));
		email.sendKeys("mohseenkilledar@gmail.com");
		Thread.sleep(2000);
		
		WebElement password = driver.findElement(By.cssSelector("input[placeholder='Enter your password']"));
		password.sendKeys("Password@123");
		Thread.sleep(2000);
		
		WebElement button = driver.findElement(By.cssSelector("button[type='submit']"));
		button.click();
		Thread.sleep(2000);
		
		
	}
	

}
