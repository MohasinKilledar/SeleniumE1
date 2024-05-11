package Handlling_Dropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selction_MethodDD {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/karis/OneDrive/Desktop/Web%20Element/single%20select%20dropdown.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		WebElement singleselectDD = driver.findElement(By.id("menu"));
		Select sel = new Select(singleselectDD);
		sel.selectByIndex(1);// By using Index value of dropdown
		Thread.sleep(2000);

		sel.selectByValue("v3");// By using value of option for dropdown
		Thread.sleep(2000);

		sel.selectByVisibleText("Coffee");// By using Text of dropdown
		Thread.sleep(2000);
		
		//driver.close();

	}

}
