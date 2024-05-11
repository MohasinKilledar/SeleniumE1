package Pratiti;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindow {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		String parentwdwTitle = driver.getTitle();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("tshirts",Keys.ENTER);
		driver.findElement(By.partialLinkText("Pack of 4 Men Solid Round Neck Polyester Silver, Blue, ..")).click();
		
		
		
		Set<String> allwindows = driver.getWindowHandles();
		
		for(String aw :allwindows )
		{
			String title = driver.switchTo().window(aw).getTitle();
			Thread.sleep(2000);
			if(!title.equalsIgnoreCase(parentwdwTitle))
			{
				
				
				driver.close();
				
				
			}
		
			
		}
		

	}

}
