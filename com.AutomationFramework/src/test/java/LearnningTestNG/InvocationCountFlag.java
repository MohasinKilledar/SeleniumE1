package LearnningTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCountFlag {
	@Test (priority = 1)
	  public void login() {
		  Reporter.log("Login Method", true);
		  
	  }
	  
	  @Test (priority = 2 , invocationCount = 5)
	  public void addToCart() {
		  Reporter.log("addToCart Method", true);
		  
	  }
	  
	  
	  @Test (priority = 3 , invocationCount = 3)
	  public void logout() {
		  Reporter.log("logout Method", true);
	  }
}
