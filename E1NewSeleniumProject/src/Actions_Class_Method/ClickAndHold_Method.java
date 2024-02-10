package Actions_Class_Method;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold_Method {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/clickHold");

		Actions act = new Actions(driver);// To create the object of Actions class
		
		
		// To find the element to be clicked and hold
		WebElement clickAndHold = driver.findElement(By.id("circle"));
		
		act.clickAndHold(clickAndHold).perform();// To perform click and hold operation
		
		Thread.sleep(4000);
		driver.close();

	}

}
