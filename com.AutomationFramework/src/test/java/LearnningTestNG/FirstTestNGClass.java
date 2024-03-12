package LearnningTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FirstTestNGClass {
  @Test(priority = 1)
  public void login() {
	  
	 Reporter.log("This is Login Method" , true);
	 
  }
  
  @Test(priority = 2)
  public void addToCart() {
	  
	  Reporter.log("This is addToCart Method" , true);
		 
		 
	  }
  
  @Test(priority = 3)
  public void logout() {
	  
	  Reporter.log("This is logout Method" , true);
		 
	  }
  
}
