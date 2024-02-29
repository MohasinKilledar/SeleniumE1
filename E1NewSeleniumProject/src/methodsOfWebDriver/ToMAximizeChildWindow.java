package methodsOfWebDriver;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToMAximizeChildWindow {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://omayo.blogspot.com/");
		
		
		driver.findElement(By.partialLinkText("Open a popup window")).click();// To get the new Window
		
		Set<String> allwindows = driver.getWindowHandles();// To get the Address of all window
		
		for(String aw : allwindows )
		{
			String title = driver.switchTo().window(aw).getTitle();// To get The title of each window
			
			if(title.equals("New Window"))// To compare the title with the title of child window
			{
				driver.manage().window().maximize();// To maximize the chile window
			}
				
			
		
		
		}
		

}}
