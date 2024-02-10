package Handlling_Dropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectAll_Method {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("file:///C:/Users/karis/OneDrive/Desktop/Web%20Element/Multipleselectdropdown.html");

		WebElement multiselectDD = driver.findElement(By.id("menu"));
		Select option = new Select(multiselectDD);

		// To select all the option from the dropdown using for loop
		for (int i = 0; i <= 5; i++) {
			option.selectByIndex(i);
			Thread.sleep(2000);

		}
		// To deselect all the option from the dropdown using for loop
		for (int j = 0; j <= 5; j++) {
			option.deselectByIndex(j);
			Thread.sleep(2000);

		}
	}

}
