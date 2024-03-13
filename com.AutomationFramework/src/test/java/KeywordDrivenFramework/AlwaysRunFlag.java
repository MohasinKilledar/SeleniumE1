package KeywordDrivenFramework;

import org.testng.Reporter;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class AlwaysRunFlag {
	@Test 
	  public void login() 
	 {
		  org.testng.Assert.fail();
		  Reporter.log("Login Method", true);
		  
	  }
	  
	  @Test (dependsOnMethods = "login")
	  public void addToCart() 
	  {
		  Reporter.log("addToCart Method", true);
		  
	  }
	  
	  
	  @Test (dependsOnMethods = "addToCart" , alwaysRun = true)
	  public void logout() {
		  Reporter.log("logout Method", true);
	  }
}
