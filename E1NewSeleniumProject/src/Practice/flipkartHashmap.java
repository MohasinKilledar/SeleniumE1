package Practice;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkartHashmap {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		HashMap<String, String> hp = new HashMap<String, String>();
		hp.put("g", driver.findElement(By.xpath("//span[text()='Grocery']")).getText());
		hp.put("m", driver.findElement(By.xpath("//span[text()='Mobiles']")).getText());
		hp.put("f", driver.findElement(By.xpath("//span[text()='Fashion']")).getText());
		hp.put("e", driver.findElement(By.xpath("//span[text()='Electronics']")).getText());
		hp.put("hf", driver.findElement(By.xpath("//span[text()='Home & Furniture']")).getText());
		hp.put("a", driver.findElement(By.xpath("//span[text()='Appliances']")).getText());
		hp.put("btm", driver.findElement(By.xpath("//span[text()='Beauty, Toys & More']")).getText());
		hp.put("tw", driver.findElement(By.xpath("//span[text()='Two Wheelers']")).getText());
		hp.put("travel", driver.findElement(By.xpath("//span[text()='Travel']")).getText());

		System.out.println(hp);// Printing pairs from HashMap

		// Remove a pair from HashMap by using key
		hp.remove("e");
		System.out.println(hp);

		// Retrive a single pair from HashMap using key value
		System.out.println(hp.get("m"));

		// Reading Keys and values from HashMap

		for (Map.Entry m : hp.entrySet()) {

			System.out.println((m.getKey() + "  " + m.getValue()));
		}

	}

}
