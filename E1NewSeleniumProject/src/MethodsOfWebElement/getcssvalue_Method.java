package MethodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getcssvalue_Method {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 driver.get(" http://127.0.0.1/login.do;jsessionid=53pedct13hldf");
		 
		 
		WebElement loginbtn = driver.findElement(By.id("loginButton"));// To find Login Button and store in a variable.
	String cssvalue = loginbtn.getCssValue("background");// To get the css value for background
	System.out.println(cssvalue);// To print the recived value in the console
	
	String color =loginbtn.getCssValue("color");//To get the css value for color
	System.out.println(color);//To print the recived value in the console

	
	

	}

}
