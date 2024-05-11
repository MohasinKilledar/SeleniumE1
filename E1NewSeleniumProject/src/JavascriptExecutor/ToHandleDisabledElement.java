package JavascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleDisabledElement {

	public static void main(String[] args) throws InterruptedException {
		
		
		//By using "argument[]" and "document" to handle disabled element.
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//li[text()='Disabled']")).click();
		Thread.sleep(2000);
		
		
		
		WebElement disabledTextBox = driver.findElement(By.id("name"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;// To typecasting into javascript
		
		//To pass input to Disabled Element
		//js.executeScript("arguments[0].value='VIRAT'",disabledTextBox );
		js.executeScript("document.getElementById('name').value='admin'");
		Thread.sleep(3000);
		
		//js.executeScript("document.getElementById('name').value=''");//To clear the content from diabled TextBox
		
		js.executeScript("arguments[0].value=''",disabledTextBox );
		
		
		

	}

}
