package Test_Package;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Generic_Package.CustomeListeners;
import Generic_Package.BaseTest;
import Generic_Package.Flib;
import Page_Package.LoginPage;




@Listeners(CustomeListeners.class)
public class InvalidLoginTestCase extends BaseTest {

	
	
	@Test
	public void invalidLogin_TC() throws EncryptedDocumentException, IOException {
		

		Flib lib = new Flib();

		int rc = lib.getRowCount(Excel_Path, sheetname);
		
		LoginPage ln = new LoginPage(driver);
		

		for (int i = 1; i <= rc; i++)

		{

			ln.invalidloginMethod(lib.getDataFromExcel(Excel_Path , sheetname, i, 0),lib.getDataFromExcel(Excel_Path, sheetname, i, 1));
		}

		

		
	}

}
