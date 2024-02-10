package Actions_Class_Method;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClickMEthod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/button/buttonRight?sublist=1");

		Actions act = new Actions(driver);// To create the object of Actions class
		WebElement rigthclickbtn1 = driver.findElement(By.xpath("//button[text()='Right Click']"));
		act.contextClick(rigthclickbtn1).perform();
		WebElement btnopt = driver.findElement(By.xpath("//div[text()='Yes']"));
		act.click(btnopt).perform();

		WebElement rigthclickbtn2 = driver.findElement(By.xpath("//button[@id='btn31']"));
		act.contextClick(rigthclickbtn2).perform();
		WebElement btnopt1 = driver.findElement(By.xpath("//div[text()='No']"));
		act.click(btnopt1).perform();

		WebElement rigthclickbtn3 = driver.findElement(By.xpath("//button[@id='btn32']"));
		act.contextClick(rigthclickbtn3).perform();
		WebElement btnopt2 = driver.findElement(By.xpath("//div[text()='4']"));
		act.click(btnopt2).perform();

	}

}
