package Assignment_On_Login_page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstCryHomePage {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.firstcry.com/");
		WebElement searchBox = driver.findElement(By.xpath("//input[@id='search_box']"));

		searchBox.clear();
		searchBox.sendKeys("shirt", Keys.ENTER);

	}

}
