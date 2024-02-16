package Practice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods_Of_WebDriver {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://www.flipkart.com/");
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Dimension targetSize = new Dimension(200,500);
		driver.manage().window().setSize(targetSize);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Point targetPosition = new Point(500, 500);
		driver.manage().window().setPosition(targetPosition);
		String title = driver.getTitle();
		System.out.println(title);
		String sourceCode = driver.getPageSource();
		System.out.println(sourceCode);
		driver.close();

	}

}
