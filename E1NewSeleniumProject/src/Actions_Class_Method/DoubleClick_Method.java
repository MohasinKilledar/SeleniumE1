package Actions_Class_Method;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick_Method {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/button/buttonDouble?sublist=2");

		Actions act = new Actions(driver);
		WebElement doubleclick1 = driver.findElement(By.xpath("//button[@id='btn20']"));
		act.doubleClick(doubleclick1).perform();// To perform double click operation on yes button

		WebElement doubleclick2 = driver.findElement(By.xpath("//button[@id='btn23']"));
		act.doubleClick(doubleclick2).perform();// To perform double click operation on no button

		WebElement doubleclick3 = driver.findElement(By.xpath("//button[@id='btn26']"));
		act.doubleClick(doubleclick3).perform();// To perform double click operation on Rating (3) button

	}

}
