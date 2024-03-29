package KeywordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;

public class ValidLogin extends BaseTest {

	public static void main(String[] args) throws IOException {

		BaseTest test = new BaseTest();
		test.setUp();

		Flib lib = new Flib();

		String username = lib.getDataFromProperty(PROP_PATH, "username");
		String password = lib.getDataFromProperty(PROP_PATH, "password");

		test.driver.findElement(By.name("username")).sendKeys(username);
		test.driver.findElement(By.name("pwd")).sendKeys(password);
		test.driver.findElement(By.id("loginButton")).click();

		test.tearDown();

	}

}
