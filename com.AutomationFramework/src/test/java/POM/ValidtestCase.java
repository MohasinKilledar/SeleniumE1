package POM;

import java.io.IOException;

public class ValidtestCase extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {

		// To load the non static members from BaseTest class
		BaseTest test = new BaseTest();

		test.setUp();

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

		// To close the browser
		test.tearDown();

	}

}
