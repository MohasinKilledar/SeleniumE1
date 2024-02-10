package MethodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getAttribute_Method {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 driver.get(" http://127.0.0.1/login.do;jsessionid=53pedct13hldf");
		 
		WebElement pwd = driver.findElement(By.name("pwd"));
		String attributeValue = pwd.getAttribute("type");
		System.out.println(attributeValue);

	}

}
