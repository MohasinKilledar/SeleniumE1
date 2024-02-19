package HandllingPopup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertPopups {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		//To generate alert popup
		driver.findElement(By.id("alert1")).click();
		
		Thread.sleep(2000);
	    
		
		//To switch the control to Alert Popup
		Alert alertPopup = driver.switchTo().alert();
		
		//To click on alert popup
		alertPopup.accept();
		

	}

}
