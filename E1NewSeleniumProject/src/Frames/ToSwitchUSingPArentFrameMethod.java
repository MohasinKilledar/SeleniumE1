package Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwitchUSingPArentFrameMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.bluestone.com/");

		driver.findElement(By.id("denyBtn")).click();

		driver.switchTo().frame("fc_widget");

		WebElement chatButton = driver.findElement(By.id("chat-icon"));
		chatButton.click();

		driver.switchTo().parentFrame();

		driver.findElement(By.xpath("//input[@type='nametext']")).sendKeys("Mohasin");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@type='emailemail']")).sendKeys("mohseenkilledar@gmail.com");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@type='textphone']")).sendKeys("9876543210");
		Thread.sleep(2000);

	}

}
