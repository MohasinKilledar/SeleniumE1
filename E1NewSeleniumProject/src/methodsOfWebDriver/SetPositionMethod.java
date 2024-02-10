package methodsOfWebDriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPositionMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Point targetPoint = new Point(400, 200);// To pass X and Y Co - Ordinate
		driver.manage().window().setPosition(targetPoint); // To pass the co - ordinate to set the postion

	}

}
