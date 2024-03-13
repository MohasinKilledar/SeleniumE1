package KeywordDrivenFramework;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethod {
	@Test 
	  public void login() {
		  Reporter.log("Login Method", true);
		  
	  }
	  
	  @Test (dependsOnMethods = "login")
	  public void addToCart() {
		  Reporter.log("addToCart Method", true);
		  
	  }
	  
	  
	  @Test (dependsOnMethods = "addToCart")
	  public void logout() {
		  Reporter.log("logout Method", true);
	  }
}
