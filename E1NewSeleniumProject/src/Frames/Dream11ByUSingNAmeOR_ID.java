package Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dream11ByUSingNAmeOR_ID {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.dream11.com/");

		//To switch the control to frame by usnig ID
		driver.switchTo().frame("send-sms-iframe");

		//To perform operation on element designed inside frame
		driver.findElement(By.id("regEmail")).sendKeys("9882517498");

	}

}
