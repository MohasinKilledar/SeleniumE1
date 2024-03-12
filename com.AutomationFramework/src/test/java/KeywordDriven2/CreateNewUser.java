package KeywordDriven2;

import java.io.IOException;

import POM.Flib;

public class CreateNewUser extends BaseTest {

	public static void main(String[] args) throws IOException {
		BaseTest test = new BaseTest();
		test.setUp();
		
		Flib lib = new Flib();
		
		LoginPage lp = new LoginPage(driver);
		lp.validLoginMethod(lib.getDataFromProperty(Prop_Path,"username"),lib.getDataFromProperty(Prop_Path, "password"));

		HomePage hp = new HomePage(driver);
		hp.getUsersModule().click();
		
		UserPage up = new UserPage(driver);
		up.getcreateNewUserButton().click();
		
		String usn = lib.getDataFromExcel(Excel_Path, "managercreds", 1, 0);
		String pwd = lib.getDataFromExcel(Excel_Path, "managercreds", 1, 1);
		String fname = lib.getDataFromExcel(Excel_Path, "managercreds", 1, 2);
		String lname = lib.getDataFromExcel(Excel_Path, "managercreds", 1, 3);
		
		
		up.createNewUsermethod(usn, pwd, fname, lname);
		
		
	}

}
