package HandllingPopup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Authentication_Popup {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://shoppersstack.com/");
	
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	WebElement swagger = driver.findElement(By.xpath("//a[text()='Swagger documentation']"));
	wait.until(ExpectedConditions.elementToBeClickable(swagger));
	swagger.click();

	}

}
