package MethodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickMethod {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 
		 //To find login button and store in a variable
		 driver.get(" http://127.0.0.1/login.do;jsessionid=53pedct13hldf");
		WebElement loginbutton = driver.findElement(By.id("loginButton"));
		loginbutton.click(); // To click on login button.
		
		 

	}

}
