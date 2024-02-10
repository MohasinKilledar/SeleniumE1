package MethodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText_Method {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(" http://127.0.0.1/login.do;jsessionid=53pedct13hldf");

		WebElement loginbtn = driver.findElement(By.id("loginButton"));
		String login_Text = loginbtn.getText();// To get the text of login button
		System.out.println(login_Text);//Tomprint the text of login button in cosole

	}

}
