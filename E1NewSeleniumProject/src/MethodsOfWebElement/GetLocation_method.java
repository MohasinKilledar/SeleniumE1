package MethodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation_method {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 driver.get(" http://127.0.0.1/login.do;jsessionid=53pedct13hldf");
		 
		 WebElement loginbtn = driver.findElement(By.id("loginButton"));// tO FIND THE LOGIN BUTTON
		 
		Point point = loginbtn.getLocation();// tO GET THE LOACTION OF LOGIN BUTTON.
		int x_Axis = point.getX();
		int y_Axis =point.getY();
		System.out.println("X Axis is :"+x_Axis+" and " +"Y Axis is :" +y_Axis);
	}

}
