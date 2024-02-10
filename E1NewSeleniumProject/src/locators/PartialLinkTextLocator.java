package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkTextLocator {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://shoppersstack.com/");
		Thread.sleep(3000);
	    WebElement signin = driver.findElement(By.partialLinkText("loginBtn"));
	    signin.click();
	    
		

	}

}
