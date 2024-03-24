package Generic_Package;

import java.util.Random;

import org.openqa.selenium.support.ui.Select;

public class Worklib extends BaseTest{
	
	
	public int randomNo()
	{
		
		Random r = new Random();
		int no = r.nextInt(10000);
		return no;
		
		
	}
	
	

}
