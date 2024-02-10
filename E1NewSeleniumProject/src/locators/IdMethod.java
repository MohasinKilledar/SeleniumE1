package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		Thread.sleep(2000);

		WebElement textBox = driver.findElement(By.id("email"));
		textBox.sendKeys("Mohasin");
		WebElement txtbox = driver.findElement(By.id("pass"));
		txtbox.sendKeys("Password@123");
		Thread.sleep(2000);
		WebElement login = driver.findElement(By.tagName("button"));
		login.click();
		Thread.sleep(5000);
		

	}

}
