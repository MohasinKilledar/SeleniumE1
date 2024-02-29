package methodsOfWebDriver;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandleMethod2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://omayo.blogspot.com/");
		String parentwindowTitle = driver.getTitle();//To get The title of parent window
		
		driver.findElement(By.partialLinkText("Open a popup window")).click();// To open a new window
		Set<String> allWindows = driver.getWindowHandles();// To get all address of all the window
		
		for(String aw :allWindows)
		{
			
			String title = driver.switchTo().window(aw).getTitle();// To get the title of each window
			
			if(!title.equals(parentwindowTitle))//To comapre the title of parent window title 
			{
				
				driver.close();// to close the chile window
			}
			
		}

	}

}
