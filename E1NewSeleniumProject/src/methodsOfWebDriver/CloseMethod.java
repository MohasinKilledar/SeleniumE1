package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseMethod {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();// To launch chrome browser
		Thread.sleep(3000);// To stop the execution for 5 sec
		driver.close();// To close the browser window

	}

}
