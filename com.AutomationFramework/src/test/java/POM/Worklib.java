package POM;

import java.util.Random;

public class Worklib {
	
	
	public int randomNo()
	{
		
		Random r = new Random();
		int no = r.nextInt(10000);
		return no;
		
		
	}

}
