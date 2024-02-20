package HandllingPopup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleNotificationPopupUsingRobotClass {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.easemytrip.com/");
		Thread.sleep(2000);
		
		
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);

		
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);

		
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);

		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);


	}

}
