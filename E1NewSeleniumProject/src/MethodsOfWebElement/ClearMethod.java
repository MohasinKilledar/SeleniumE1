package MethodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 driver.get(" http://127.0.0.1/login.do;jsessionid=53pedct13hldf");
		 
		 //TO FIND USERNAME TEXTBOX AND STORE IN A VARIABLE
		 WebElement usernamebtn = driver.findElement(By.name("username"));
		 usernamebtn.sendKeys("VIRAT");
		 Thread.sleep(2000);
		 
		 usernamebtn.clear();//To clear the text present in username textbox.
		 

	}

}
