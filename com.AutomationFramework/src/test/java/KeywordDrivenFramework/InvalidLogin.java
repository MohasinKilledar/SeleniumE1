package KeywordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;

public class InvalidLogin extends BaseTest implements IAutoConstant {

	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest test = new BaseTest();
		test.setUp();

		Flib lib = new Flib();

		int rc = lib.getRowCount(Excel_Path, sheetname);

		for (int i = 1; i <= rc; i++)

		{

			test.driver.findElement(By.name("username")).sendKeys(lib.getDataFromExcel(Excel_Path, sheetname, i, 0));
			Thread.sleep(1000);
			test.driver.findElement(By.name("pwd")).sendKeys(lib.getDataFromExcel(Excel_Path, sheetname, i, 1));
			Thread.sleep(1000);
			test.driver.findElement(By.id("loginButton")).click();
			Thread.sleep(1000);
			test.driver.findElement(By.name("username")).clear();

		}

		test.tearDown();

	}

}
