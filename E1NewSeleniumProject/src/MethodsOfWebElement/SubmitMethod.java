package MethodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubmitMethod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 driver.get("https://www.instagram.com/");
		 
		 driver.findElement(By.name("username")).sendKeys("Mohasin");
		 driver.findElement(By.name("password")).sendKeys("Killedar");
		 
		 
		 WebElement loginbtn = driver.findElement(By.xpath("//div[text()='Log in']"));
		 loginbtn.submit();

	}

}
