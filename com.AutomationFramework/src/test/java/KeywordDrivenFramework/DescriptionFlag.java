package KeywordDrivenFramework;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DescriptionFlag {
  @Test(description ="This Method is for login", priority = 1)
  public void login() {
	  Reporter.log("Login Method", true);
	  
  }
  
  @Test(description ="This Method is for addToCart", priority = 2)
  public void addToCart() {
	  Reporter.log("addToCart Method", true);
	  
  }
  
  
  @Test(description ="This Method is for logout", priority = 3)
  public void logout() {
	  Reporter.log("logout Method", true);
  }
}
