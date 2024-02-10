package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Unique_Attribute {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://app.fireflink.com/signin");

		Thread.sleep(2000);

		// WebElement signinlink = driver.findElement(By.partialLinkText("Sign In"));
		// signinlink.click();
		// Thread.sleep(2000);

		WebElement email = driver.findElement(By.xpath("//input[@name='emailId']"));
		email.sendKeys("mohseenkilledar@gmail.com");
		Thread.sleep(2000);

		WebElement password = driver.findElement(By.xpath("//input[@id='mui-2']"));
		password.sendKeys("Password@123");
		Thread.sleep(2000);

		WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
		button.click();
		Thread.sleep(2000);
		driver.close();

	}

}
