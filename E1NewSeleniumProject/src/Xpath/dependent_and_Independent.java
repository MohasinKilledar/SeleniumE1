package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dependent_and_Independent {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");//To launch make my trip
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='flt_fsw_inputBox dates inactiveWidget ']")).click();
		Thread.sleep(4000);

		driver.findElement(By.xpath("//div[@role='grid']/ancestor::div[@class ='flt_fsw_inputBox dates inactiveWidget activeWidget']//p[text()='27' ]")).click();
		Thread.sleep(2000);

		driver.close();
	
		
		
		
		
		//div[text()='February']/ancestor::div[@class='flt_fsw_inputBox dates inactiveWidget activeWidget']//p[text()='27']

	}

}
