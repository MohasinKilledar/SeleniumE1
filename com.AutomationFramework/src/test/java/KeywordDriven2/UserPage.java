package KeywordDriven2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserPage {

	
	@FindBy(xpath="//input[@value='Create New User']") private WebElement  createNewUserButton;
	@FindBy(xpath= "//input[@name='username']") private WebElement usernameTB;
	@FindBy(xpath ="//input[@name='passwordText']") private WebElement passwordTB;
	@FindBy(xpath ="//input[@name='passwordTextRetype']") private WebElement retypepwdTB;
	@FindBy(xpath = "//input[@name='firstName']")private WebElement firstNameTB;
	@FindBy(xpath ="//input[@name='lastName']") private WebElement lastNameTB;
	@FindBy(xpath="//input[@id='right12']") private WebElement modifyTTCheckBox;
	@FindBy(xpath="//input[@id='right2']") private WebElement manageCustAndprojectCheckBox;
	@FindBy(xpath="//input[@id='right5']") private WebElement manageusersCheckBox;
	@FindBy(xpath="//input[@id='right7']") private WebElement managebillingTypesCheckBox;
	@FindBy(xpath="//input[contains(@value,'Create User ')]")private WebElement createUserButton;
	
	
	public UserPage(WebDriver driver)
	{
		
		PageFactory.initElements(driver,this);
	}


	public WebElement getcreateNewUserButton() {
		return createNewUserButton;
	}


	public WebElement getUsernameTB() {
		return usernameTB;
	}


	public WebElement getPasswordTB() {
		return passwordTB;
	}


	public WebElement getRetypepwdTB() {
		return retypepwdTB;
	}


	public WebElement getFirstNameTB() {
		return firstNameTB;
	}


	public WebElement getLastNameTB() {
		return lastNameTB;
	}


	public WebElement getModifyTTCheckBox() {
		return modifyTTCheckBox;
	}


	public WebElement getManageCustAndprojectCheckBox() {
		return manageCustAndprojectCheckBox;
	}


	public WebElement getManageusersCheckBox() {
		return manageusersCheckBox;
	}


	public WebElement getManagebillingTypesCheckBox() {
		return managebillingTypesCheckBox;
	}


	public WebElement getCreateUserButton() {
		return createUserButton;
	}
	
	
	public void createNewUsermethod(String username ,String password , String firstName , String lastname )
	{
		//createNewUserButton.click();
		usernameTB.sendKeys(username);
		passwordTB.sendKeys(password);
		retypepwdTB.sendKeys(password);
		firstNameTB.sendKeys(firstName);
		lastNameTB.sendKeys(lastname);
		modifyTTCheckBox.click();
		manageCustAndprojectCheckBox.click();
		manageusersCheckBox.click();
		managebillingTypesCheckBox.click();
		createUserButton.click();
		
	}
	
	
	
	
	
	
	
	
	
}
