package methodsOfWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");//To launch Google
		Thread.sleep(2000);
		
		WebElement activeEle = driver.switchTo().activeElement();
		activeEle.sendKeys("bikes");
		Thread.sleep(2000);

		 List<WebElement> bikesOption = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
		 
		 for(int i =0 ; i<bikesOption.size(); i++)
		 {
			 String ops = bikesOption.get(i).getText();
			 System.out.println(ops);
				Thread.sleep(2000);

			 
			 
		 }
		// for(WebElement we : bikesOption)
		// {
		 
		//	 String ops = we.getText();
			// System.out.println(ops);
				//Thread.sleep(2000);
			 
		// }
		

	}

}
