package Test_Package;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Generic_Package.BaseTest;
import Generic_Package.CustomeListeners;
import Generic_Package.Flib;
import Generic_Package.Worklib;
import Page_Package.HomePage;
import Page_Package.LoginPage;
import Page_Package.UsersPage;


@Listeners(CustomeListeners.class)
public class CreateUserManager extends BaseTest {

	@Test
	public void createUserManager() throws IOException, InterruptedException {

		

		Flib lib = new Flib();

		LoginPage ln = new LoginPage(driver);

		ln.validloginMethod(lib.getDataFromProperty(PROP_PATH, "username"),lib.getDataFromProperty(PROP_PATH, "password"));

		HomePage hp = new HomePage(driver);
		hp.getUsersModule().click();

		UsersPage up = new UsersPage(driver);
		up.getCreateNewUserButton().click();

		Worklib wl = new Worklib();
		int no = wl.randomNo();

		String usn = lib.getDataFromExcel(Excel_Path, "managercreds", 1, 0);
		String pwd = lib.getDataFromExcel(Excel_Path, "managercreds", 1, 1);
		String fname = lib.getDataFromExcel(Excel_Path, "managercreds", 1, 2);
		String lname = lib.getDataFromExcel(Excel_Path, "managercreds", 1, 3);

		up.createNewUser(usn + no, pwd + no, fname + no, lname + no);
		Thread.sleep(sleep);

		hp.getLogoutLink().click();
		
		

	}

}
