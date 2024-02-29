package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoapp_ToHandleNestedFrames {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		
		driver.findElement(By.xpath("//section[text()='Frames']")).click();
		
		driver.findElement(By.xpath("//section[text()='iframes']")).click();
		
		//To find the frame and store in a variable
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='w-full h-96']"));
		
		//To switch the control to frame element
		
		driver.switchTo().frame(frame);
		
		//To find the element present inside frame
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Mohasin");
		Thread.sleep(2000);
		
		
		// To switch the control back to main webpage
		driver.switchTo().defaultContent();
		
		
		//To click on Nested iframe Option on main webpage
		driver.findElement(By.partialLinkText("Nested iframe")).click();
		
		
		


	}

}
