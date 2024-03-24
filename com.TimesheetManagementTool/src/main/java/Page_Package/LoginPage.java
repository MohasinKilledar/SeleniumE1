package Page_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage  {

	@FindBy(name = "username")
	private WebElement usnTB;
	@FindBy(name = "pwd")
	private WebElement pwdTB;
	@FindBy(id = "loginButton")
	private WebElement loginBtn;
	@FindBy(name = "remember")
	private WebElement rememberMeCheckBox;
	@FindBy(partialLinkText = "Actimind Inc.")
	private WebElement actimindLink;
	
	
	//Intialization

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
	
	//Utilization
	public WebElement getUsnTB() {
		return usnTB;
	}

	public WebElement getPwdTB() {
		return pwdTB;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public WebElement getRememberMeCheckBox() {
		return rememberMeCheckBox;
	}

	public WebElement getActimindLink() {
		return actimindLink;
	}

	
	// Operational Methods
	public void validloginMethod(String username, String password)
	{
		usnTB.sendKeys(username);
		pwdTB.sendKeys(password);
		loginBtn.click();
		
	}
	
	public void invalidloginMethod(String username , String password)
	{
		usnTB.sendKeys(username);
		pwdTB.sendKeys(password);
		loginBtn.click();
		usnTB.clear();
	}
	
	

}
