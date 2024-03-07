package KeywordDriven2;

import java.io.IOException;

import org.openqa.selenium.By;

public class ValidLoginToActiTime extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {

		BaseTest test = new BaseTest();

		test.setUp();

		Flib lib = new Flib();

		String username = lib.getPropertyData(Prop_Path, "username");
		String password = lib.getPropertyData(Prop_Path, "password");

		test.driver.findElement(By.name("username")).sendKeys(username);
		Thread.sleep(sleep);
		test.driver.findElement(By.name("pwd")).sendKeys(password);
		Thread.sleep(sleep);
		test.driver.findElement(By.id("loginButton")).click();
		Thread.sleep(sleep);

	
		test.teardown();

	}

}
