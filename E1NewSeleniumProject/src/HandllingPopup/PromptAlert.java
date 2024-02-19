package HandllingPopup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://omayo.blogspot.com/");

		driver.findElement(By.id("prompt")).click();
		Thread.sleep(1000);

		// To switch the control to popup
		Alert promptAlert = driver.switchTo().alert();

		// To get the text of the popup and print in console
		String text = promptAlert.getText();
		System.out.println(text);
		Thread.sleep(1000);

		// To pass the input to prompt popup
		promptAlert.sendKeys("Mohasin");
		Thread.sleep(1000);

		// To click on OK button.
		promptAlert.accept();
		Thread.sleep(1000);

	}

}
