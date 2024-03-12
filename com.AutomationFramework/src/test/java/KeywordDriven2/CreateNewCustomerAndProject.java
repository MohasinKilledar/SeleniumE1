package KeywordDriven2;

import java.io.IOException;

import POM.Flib;

public class CreateNewCustomerAndProject extends BaseTest {

	public static void main(String[] args) throws IOException {
		
		Flib lib = new Flib();
		
		BaseTest test = new BaseTest();
		test.setUp();
		
		LoginPage lp = new LoginPage(driver);
		lp.validLoginMethod(lib.getDataFromProperty(Prop_Path, "username"), lib.getDataFromProperty(Prop_Path, "password"));

		HomePage hp = new HomePage(driver);
		hp.getTasksModule().click();
		
		TasksPage tp = new TasksPage(driver);
		tp.createNewCustomerMethod(lib.getDataFromExcel(Excel_Path, "taskspagedetails", 1, 0));
		tp.createNewProjectMethod(lib.getDataFromExcel(Excel_Path, "taskspagedetails", 1, 1),lib.getDataFromExcel(Excel_Path, "taskspagedetails", 1, 0));
		
		tp.deleteAllCustAndProjectMethod();
		
		
		
	}
	

}
