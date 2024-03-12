package KeywordDriven2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(xpath ="//input[@name='username']") private WebElement usernameTB;
	@FindBy(xpath = "//input[@name='pwd']")private WebElement pwdTB;
	@FindBy(xpath ="//a[@id='loginButton']") private WebElement loginBtn;
	
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver , this);
		
	}
	
	
	
	
	public WebElement getUsernameTB() {
		return usernameTB;
	}




	public WebElement getPwdTB() {
		return pwdTB;
	}




	public WebElement getLoginBtn() {
		return loginBtn;
	}




	public void validLoginMethod(String username , String password)
	{
		usernameTB.sendKeys(username);
		pwdTB.sendKeys(password);
		loginBtn.click();		
	}
	
	public void inValidLoginMehod(String username , String password)
	{
		usernameTB.sendKeys(username);
		pwdTB.sendKeys(password);
		loginBtn.click();
		usernameTB.clear();
	}

}
