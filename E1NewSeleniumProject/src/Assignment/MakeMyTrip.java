package Assignment;

import java.time.Duration;
import java.util.Date;

import javax.swing.text.DateFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.makemytrip.com/");
	
		System.
		
		driver.findElement(By.xpath("//label[@for='departure']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='DayPicker-Month']/ancestor::div[@class='DayPicker-Months']/descendant::p[text()='25']")).click();
		
		

	}

}
