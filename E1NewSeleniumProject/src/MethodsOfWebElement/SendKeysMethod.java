package MethodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysMethod {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 driver.get(" http://127.0.0.1/login.do;jsessionid=53pedct13hldf");
		 
		 //TO FIND USERNAME TEXTBOX AND STORE IN A VARIABLE
		 WebElement usernamebtn = driver.findElement(By.name("username"));
		 usernamebtn.sendKeys("VIRAT");// To Pass the input to username textbox.
		 
		//TO FIND password TEXTBOX AND STORE IN A VARIABLE
		 WebElement pwdbtn = driver.findElement(By.name("pwd"));
		 pwdbtn.sendKeys("MANAGER");//To Pass the input to password textbox.

	}

}
