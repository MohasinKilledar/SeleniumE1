package LearnningTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityFlag {
  @Test (priority = -1)
  public void login() {
	  Reporter.log("This is login method", true);
	  
  }
  
  @Test(priority = 2)
  public void addToCart() {
	  
	  Reporter.log("This is addToCart  method", true);
  }
  
  @Test(priority = 1)
  public void logout() {
	  
	  Reporter.log("This is logout method", true);
  }
}
