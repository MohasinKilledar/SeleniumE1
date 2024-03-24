package Test_Package;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Generic_Package.BaseTest;
import Generic_Package.CustomeListeners;
import Generic_Package.Flib;
import Page_Package.HomePage;
import Page_Package.LoginPage;

@Listeners(CustomeListeners.class)
public class ValidtestCase extends BaseTest {

	
	@Test
	public void validLogin_TC() throws IOException, InterruptedException {

	

		// To load the non static members from Flib class
		Flib lib = new Flib();

		// To load the nonstatic members from loginpage class
		LoginPage ln = new LoginPage(driver);

		// To Perform login operation by calling the method
		ln.validloginMethod(lib.getDataFromProperty(PROP_PATH, "username"),
				lib.getDataFromProperty(PROP_PATH, "password"));
		Thread.sleep(sleep);

		HomePage hp = new HomePage(driver);
		hp.getLogoutLink().click();
		Thread.sleep(sleep);

		

	}

}
