package Assignment_On_Login_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail_Login {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ifkv=ASKXGp19x5BWgLiKP3b0kxsCtWK5m4tzG6G9LkD_cqeDwSOcQ03qo19CzWRk7n0ItDaO2JR_Yd6fcA&rip=1&sacu=1&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S-2080353776%3A1705600073852298&theme=glif");
		Thread.sleep(2000);
		
		WebElement email = driver.findElement(By.cssSelector("input[autocomplete='username']"));
		email.sendKeys("mohseenkilledar@gmail.com");
		Thread.sleep(2000);
		
		WebElement password = driver.findElement(By.cssSelector(".VfPpkd-LgbsSe-OWXEXe-k8QpJ > span:nth-child(4)"));
		password.click();
		//password.sendKeys("Password@123");
		Thread.sleep(2000);
		
		WebElement button = driver.findElement(By.cssSelector("button[type='submit']"));
		button.click();
		Thread.sleep(2000);
		

	}

}
