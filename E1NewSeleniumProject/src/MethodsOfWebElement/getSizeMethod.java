package MethodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getSizeMethod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 driver.get(" http://127.0.0.1/login.do;jsessionid=53pedct13hldf");
		 
		 //TO FIND USERNAME TEXTBOX AND STORE IN A VARIABLE
		 WebElement usernamebtn = driver.findElement(By.name("username"));
		 
		Dimension size = usernamebtn.getSize();
		int height = size.getHeight();
		int Width = size.getWidth();
		System.out.println("Height is :"+height+" " +"Width is :" +Width);
		

	}

}
