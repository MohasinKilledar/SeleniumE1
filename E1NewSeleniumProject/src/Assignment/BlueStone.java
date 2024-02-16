package Assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class BlueStone {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.xpath("//span[text()='Not now']")).click();

		Actions sel = new Actions(driver);

		WebElement coins = driver.findElement(By.xpath("//a[@title='Coins']"));
		sel.moveToElement(coins).perform();

		WebElement onegram = driver.findElement(By.xpath("//span[text()='1 gram']"));
		onegram.click();

		WebElement element = driver.findElement(By.xpath("//h1[text()='1 gram 24 KT Gold Coin']"));
		boolean ele = element.isDisplayed();
		System.out.println("1 gram 24 KT Gold Coin is Dispalyed ? : " +ele);

		TakesScreenshot ts = (TakesScreenshot) driver;

		File src = ts.getScreenshotAs(OutputType.FILE);

		File dstn = new File("./screenshots/bluestone.png");

		Files.copy(src, dstn);

	}

}
