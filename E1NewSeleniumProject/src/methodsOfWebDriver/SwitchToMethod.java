package methodsOfWebDriver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.google.co.in/");
		Thread.sleep(2000);
		driver.switchTo().activeElement().sendKeys("VIRAT KOHLI", Keys.ENTER);
		Thread.sleep(2000);
		driver.close();

	}

}
