package Assignment_On_Login_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Qspider_Login_page {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://student.qspiders.com/login");
		Thread.sleep(2000);

		WebElement email = driver.findElement(By.cssSelector("input[name='email']"));
		email.sendKeys("mohseenkilledar@gmail.com");
		Thread.sleep(2000);

		WebElement pwd = driver.findElement(By.cssSelector("input[placeholder $='password']"));
		pwd.sendKeys("Mohasin@123");
		Thread.sleep(2000);

		WebElement login = driver.findElement(By.cssSelector("button[type='submit']"));
		login.click();
		Thread.sleep(2000);

	}

}
