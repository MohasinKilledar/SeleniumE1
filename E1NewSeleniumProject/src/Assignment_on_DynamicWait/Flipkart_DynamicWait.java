package Assignment_on_DynamicWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flipkart_DynamicWait {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
       
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("HP Laptop", Keys.ENTER);
		driver.findElement(By.xpath("//div[@class='_213eRC _2ssEMF']")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='_24_Dny']")));
		driver.findElement(By.xpath("//div[@class='_24_Dny']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[@class='_3879cV' and text() ='Core i5']")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Processor']")));
		driver.findElement(By.xpath("//div[text()='Processor']")).click();
		

	}

}
