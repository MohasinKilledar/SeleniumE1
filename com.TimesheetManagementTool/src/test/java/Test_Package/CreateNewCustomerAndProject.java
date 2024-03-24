package Test_Package;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Generic_Package.BaseTest;
import Generic_Package.CustomeListeners;
import Generic_Package.Flib;
import Page_Package.HomePage;
import Page_Package.LoginPage;
import Page_Package.TasksPage;



@Listeners(CustomeListeners.class)
public class CreateNewCustomerAndProject extends BaseTest {

	@Test
	public void createNewCustomerAndProject_TC () throws IOException, EncryptedDocumentException, InterruptedException {

		
		
		Flib lib = new Flib();
		String usn = lib.getDataFromProperty(PROP_PATH, "username");
		String pwd = lib.getDataFromProperty(PROP_PATH, "password");
		
		LoginPage lp = new LoginPage(driver);
		lp.validloginMethod(usn, pwd);

		HomePage hp = new HomePage(driver);
		hp.getTasksModule().click();

		TasksPage tp = new TasksPage(driver);
		
		tp.createCutomerMethod(lib.getDataFromExcel(Excel_Path, "taskspagedetails", 1, 0));
		tp.createprojectMethod(lib.getDataFromExcel(Excel_Path, "taskspagedetails", 1, 0),
				lib.getDataFromExcel(Excel_Path, "taskspagedetails", 1, 1));
		Thread.sleep(sleep);

		tp.deleteAllCustAndProject();

		hp.getLogoutLink();

		Thread.sleep(sleep);

		

	}

}
