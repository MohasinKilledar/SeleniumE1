package Actions_Class_Method;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop_Method {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/dragDrop/dragToCorrect?sublist=1");

		Actions act = new Actions(driver);// Create the object of Actions class
       
		WebElement mobileChargerSource = driver.findElement(By.xpath("//div[text()='Mobile Charger']")); // Mobiles source webelement
		WebElement mobileChargerTarget = driver.findElement(By.xpath("//div[text()='Mobile Accessories']")); // Mobiles target webelement
		act.dragAndDrop(mobileChargerSource, mobileChargerTarget).perform();//To Drag And Drop the web elements into respective target area.

		WebElement laptopChargerSource = driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
		WebElement laptopChargerTarget = driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));
		act.dragAndDrop(laptopChargerSource, laptopChargerTarget).perform();

		WebElement mobileCoverSource = driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
		WebElement mobileCoverTarget = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
		act.dragAndDrop(mobileCoverSource, mobileCoverTarget).perform();

		WebElement laptopCoverSource = driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
		WebElement laptopCoverTarget = driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));
		act.dragAndDrop(laptopCoverSource, laptopCoverTarget).perform();

	}

}
