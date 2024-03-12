package KeywordDriven2;

import java.io.IOException;

import KeywordDrivenFramework.Flib;

public class InvalidloginTestcase extends BaseTest {

	public static void main(String[] args) throws IOException {
		
		
		Flib lib = new Flib();
		
		BaseTest test = new BaseTest();
		test.setUp();
		
		LoginPage ln = new LoginPage(driver);
		

		int rc = lib.getRowCount(Excel_Path , "invalidcreds");
	
		
		
		for(int i = 1 ; i<=rc ; i++)
		{
			
			ln.inValidLoginMehod(lib.getDataFromExcel(Excel_Path, "invalidcreds", i, 0),lib.getDataFromExcel(Excel_Path, "invalidcreds", i, 1));
			
		}
		
		test.teardown();
	}

}
