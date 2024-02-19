package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShoppersStack_Login {

	public static void main(String[] args) {
		
		//verify USer Should be Able To Login.
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://shoppersstack.com/");
		WebElement welcome = driver
				.findElement(By.xpath("//h3[text()='Welcome to ShoppersStack. Enjoy shopping with us.']"));
		boolean result = welcome.isDisplayed();
		System.out.println("Welcome to ShoppersStack. Enjoy shopping with us.Text is Dispalyed ? :" + result);

		driver.findElement(By.xpath("//button[text()='Login']")).click();
		WebElement shopperLogin = driver.findElement(By.xpath("//strong[text()='Shopper']"));
		boolean loginpage = shopperLogin.isDisplayed();
		System.out.println("Shopper Login Page is Dispalyed ? :" + loginpage);

		driver.findElement(By.id("Email")).sendKeys("mohseenkilledar@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Mohasin@123");
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		WebElement homepage = driver.findElement(By.xpath("//a[text()='Home']"));
		boolean homepge = homepage.isDisplayed();
		System.out.println("Home Page is Dispalyed ? : " + homepge);

	}

}
