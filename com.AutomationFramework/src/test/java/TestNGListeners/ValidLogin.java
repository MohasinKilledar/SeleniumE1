package TestNGListeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(CustomeListeners.class)
public class ValidLogin extends BaseTest {

	@Test
	public void login() throws InterruptedException {

		Thread.sleep(sleep);
		WebElement usn = driver.findElement(By.name("username"));
		Assert.assertEquals(usn.isDisplayed(), true , "Username TextBox is not Displayed");
		usn.sendKeys("admin");
		Thread.sleep(sleep);

		WebElement pwd = driver.findElement(By.name("pwd"));
		Assert.assertEquals(pwd.isDisplayed(), true, "Password TesxtBox is not Dispalyed");
		pwd.sendKeys("manager");
		Thread.sleep(sleep);

		WebElement loginButton = driver.findElement(By.id("loginButton"));
		Assert.assertEquals(loginButton.isDisplayed(), true, "Login Button is not Displayed");
		loginButton.click();
		Thread.sleep(sleep);

	}
}
