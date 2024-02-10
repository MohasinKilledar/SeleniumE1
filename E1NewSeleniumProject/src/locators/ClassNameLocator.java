package locators;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameLocator {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/karis/OneDrive/Desktop/Web%20Element/TEXTBOX.html");

		Thread.sleep(2000);

		WebElement textBox = driver.findElement(By.className("xyz"));

		textBox.sendKeys("Password@123");
		Thread.sleep(2000);
		driver.close();

	}
}
