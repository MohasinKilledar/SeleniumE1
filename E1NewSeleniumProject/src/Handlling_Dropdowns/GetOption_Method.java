package Handlling_Dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOption_Method {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/karis/OneDrive/Desktop/Web%20Element/Multipleselectdropdown.html");
		
		WebElement multiselectDD = driver.findElement(By.id("menu"));
		 Select ops = new Select(multiselectDD);
		 List<WebElement> op = ops.getOptions();
		 
		 for(int i = 0 ; i<=op.size(); i++)
		 {
			String result = op.get(i).getText();
			System.out.println(result);
			Thread.sleep(2000);
			 
			 
		 }

	}

}
