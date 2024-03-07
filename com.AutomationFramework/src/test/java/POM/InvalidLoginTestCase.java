package POM;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;

import KeywordDrivenFramework.BaseTest;
import KeywordDrivenFramework.Flib;

public class InvalidLoginTestCase extends BaseTest {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		BaseTest test = new BaseTest();
		test.setUp();

		Flib lib = new Flib();

		int rc = lib.getRowCount(Excel_Path, sheetname);
		
		LoginPage ln = new LoginPage(driver);
		

		for (int i = 1; i <= rc; i++)

		{

			ln.invalidloginMethod(lib.getDataFromExcel(Excel_Path , sheetname, i, 0),lib.getDataFromExcel(Excel_Path, sheetname, rc, 1));
		}

		test.tearDown();

	}

}
