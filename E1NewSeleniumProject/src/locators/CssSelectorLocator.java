package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorLocator {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();// To launch browser
		driver.manage().window().maximize();// Maximize the browser
		driver.get("https://www.instagram.com/");// to launch the app.
		Thread.sleep(2000);
		// To find or locate username textfield and pass the input
		WebElement username = driver
				.findElement(By.cssSelector("input[aria-label ='Phone number, username, or email']"));

		username.sendKeys("Mohasin");
		Thread.sleep(2000);

		// To find or locate password textfield and pass the input
		WebElement password = driver.findElement(By.cssSelector("input[type='Password']"));
		password.sendKeys("abc@123");
		Thread.sleep(2000);
		// To click on login button
		WebElement login = driver.findElement(By.cssSelector("button[type='submit']"));
		login.click();
		Thread.sleep(2000);

	}

}
