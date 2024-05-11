package Practice;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginByusingHP {

	public static HashMap<String, String> loginMethod() {
		HashMap<String, String> hp = new HashMap<String, String>();
		hp.put("x", "admin@manager");
		hp.put("y", "Admin@manager");
		hp.put("m", "mohasin@manager");

		return hp;

	}

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do");

		String creds = loginMethod().get("x");
		String arr[] = creds.split("@");

		driver.findElement(By.name("username")).sendKeys(arr[0]);
		driver.findElement(By.name("pwd")).sendKeys(arr[1]);
		driver.findElement(By.id("loginButton")).click();

	}

}
