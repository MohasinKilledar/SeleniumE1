package FinalMock;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class zomato {

	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.co.in/");
		driver.switchTo().activeElement().sendKeys("Zomato", Keys.ENTER);
		driver.findElement(By.xpath("//cite[@class='qLRx3b tjvcx GvPZzd cHaqb']")).click();
		WebElement taergetElement = driver.findElement(By.xpath("//p[text()='Contact Us']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", taergetElement);
		WebElement linkdin = driver.findElement(By.xpath("(//a[@class='sc-elhb8j-17 iDzUMo'])[1]"));
		linkdin.click();
		Thread.sleep(2000);
		String linkdintitle = ("Zomato | LinkedIn");

		driver.findElement(By.xpath("(//a[@class='sc-elhb8j-17 iDzUMo'])[2]")).click();
		driver.findElement(By.xpath("(//a[@class='sc-elhb8j-17 iDzUMo'])[3]")).click();
		driver.findElement(By.xpath("(//a[@class='sc-elhb8j-17 iDzUMo'])[4]")).click();
		driver.findElement(By.xpath("(//a[@class='sc-elhb8j-17 iDzUMo'])[5]")).click();

		Set<String> allWindows = driver.getWindowHandles();

		// if (driver.getTitle().equalsIgnoreCase(linkdintitle)) {
		for (String w : allWindows) {
			String title = driver.switchTo().window(w).getTitle();
			System.out.println(title);
			if (!(title.equalsIgnoreCase(linkdintitle))) {

				driver.close();

			} else if (title.equalsIgnoreCase(linkdintitle))

			{
				Robot robot = new Robot();
				robot.keyPress(KeyEvent.VK_TAB);
				robot.keyRelease(KeyEvent.VK_TAB);
				robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyRelease(KeyEvent.VK_ENTER);

				TakesScreenshot ts = (TakesScreenshot) driver;
				File src = ts.getScreenshotAs(OutputType.FILE);
				File dest = new File("./screenshots/Linkdin.jpg");
				Files.copy(src, dest);

			}
		}

	}

}
