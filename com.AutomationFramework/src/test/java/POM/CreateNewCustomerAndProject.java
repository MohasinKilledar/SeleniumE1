package POM;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class CreateNewCustomerAndProject extends BaseTest {

	public static void main(String[] args) throws IOException, EncryptedDocumentException, InterruptedException {

		BaseTest test = new BaseTest();
		test.setUp();
		
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

		test.tearDown();

	}

}
