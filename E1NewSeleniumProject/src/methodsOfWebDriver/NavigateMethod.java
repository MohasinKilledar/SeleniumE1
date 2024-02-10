package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://www.facebook.com/");// To launch the webapplication
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.navigate().back();// To navigate backward
		Thread.sleep(3000);
		driver.navigate().forward();// To navigate forward
		Thread.sleep(3000);
		driver.navigate().refresh();// To refresh
		driver.close();

	}

}
