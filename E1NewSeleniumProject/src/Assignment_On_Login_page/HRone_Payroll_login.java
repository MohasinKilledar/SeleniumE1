package Assignment_On_Login_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HRone_Payroll_login {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://hrone.jljhr.com/login?lang=en");
		Thread.sleep(2000);

		WebElement email = driver.findElement(By.cssSelector("input[type='text']"));
		email.sendKeys("mohseenkilledar@gmail.com");
		Thread.sleep(2000);

		WebElement pwd = driver.findElement(By.cssSelector("input[type='password']"));
		pwd.sendKeys("Mohasin@123");
		Thread.sleep(2000);

		WebElement login = driver.findElement(By.cssSelector("button[id='btnSubmit']"));
		login.click();
		Thread.sleep(2000);

	}

}
