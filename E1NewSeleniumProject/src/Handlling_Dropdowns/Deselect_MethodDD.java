package Handlling_Dropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Deselect_MethodDD {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("file:///C:/Users/karis/OneDrive/Desktop/Web%20Element/Multipleselectdropdown.html");

		WebElement multiselectDD = driver.findElement(By.id("menu"));
		
		Select option = new Select(multiselectDD);
		
		option.selectByIndex(4);
		Thread.sleep(2000);
		option.deselectByIndex(4);//Deseslect By Index Value option.
		
		option.selectByValue("v3");
		Thread.sleep(2000);
		option.deselectByValue("v3");
		
		option.selectByVisibleText("vadapav");
		Thread.sleep(2000);
		option.deselectByVisibleText("vadapav");


	}

}
