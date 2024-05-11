package Practice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class p {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");

		WebElement searchBox = driver.findElement(By.xpath("//input[@type='text']"));
		searchBox.sendKeys("tshirts", Keys.ENTER);
		System.out.println(driver.manage().getCookies());
		System.out.println(driver.manage().getCookieNamed("domain"));
		
		
		WebElement tshirt = driver
				.findElement(By.xpath("(//a[text()='Pack of 4 Men Solid Round Neck Polyester Multicolor T-S...'])[1]"));
		tshirt.click();
		

		String parentWindowtitle = "Tshirts- Buy Products Online at Best Price in India - All Categories | Flipkart.com";

		Set<String> allwindow = driver.getWindowHandles();

		for (String aw : allwindow) {
			String title = driver.switchTo().window(aw).getTitle();
			if (!title.equals(parentWindowtitle)) {
				driver.findElement(By.xpath("//li[@class='col col-6-12']")).click();
			}

		}

	}

}
