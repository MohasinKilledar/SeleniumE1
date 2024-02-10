package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocator {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("file:///C:/Users/karis/OneDrive/Desktop/Web%20Element/TEXTBOX.html");
		Thread.sleep(2000);

		WebElement textBox = driver.findElement(By.tagName("input"));// To find the pwd text field on the webpage

		textBox.sendKeys("manager");// to pass the input to pwd.

		// note : input are passed to username textfield because it is the 1st element
		// designed with input tag.

	}

}
