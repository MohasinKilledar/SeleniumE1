package Actions_Class_Method;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");

		WebElement homeAndFuirniture = driver.findElement(By.xpath("//div[@aria-label = 'Home & Furniture']"));

		Actions act = new Actions(driver);
		act.moveToElement(homeAndFuirniture).perform();

	}

}
