package KeywordDriven2;

import java.io.IOException;

public class validLoginTestCase extends BaseTest {

	public static void main(String[] args) throws IOException {
		
		
		Flib lib = new Flib();
		
		BaseTest test = new BaseTest();
		test.setUp();
		
		LoginPage ln = new LoginPage(driver);
		ln.validLoginMethod(lib.getPropertyData(Prop_Path, "username"),lib.getPropertyData(Prop_Path, "password"));

	}

}
