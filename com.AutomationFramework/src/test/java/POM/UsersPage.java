package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsersPage {
	
	
	@FindBy(xpath ="//input[@value='Create New User']")private WebElement createNewUserButton;
	@FindBy(xpath ="//input[@name='username']") private WebElement usernameTB;
	@FindBy(xpath ="//input[@name='passwordText']") private WebElement passwordTB;
	@FindBy(xpath ="//input[@name='passwordTextRetype']") private WebElement retypePasswordTB;
	@FindBy(xpath ="//input[@name='firstName']") private WebElement firstNmaeTB;
	@FindBy(xpath ="//input[@name='lastName']") private WebElement lastNmaeTB;
	@FindBy(xpath ="//input[@name='workdayDurationStr']") private WebElement workDayDuration;
	@FindBy(xpath = "//input[@id='right12']") private WebElement modifyTimeTrackChkBox;
	@FindBy(xpath = "//input[@id='right2']") private WebElement manageCustomerAndProjectsChkBox;
	@FindBy(xpath="//input[@id='right5']")private WebElement manageUsersChkBox;
	@FindBy(xpath="//input[@id='right7']")private WebElement managebillingtypesChkBox;
	@FindBy(xpath="//input[@id='right1']")private WebElement genrateReportsChkBox;
	@FindBy(xpath = "//input[@type='submit']") private WebElement createuserButton;
	@FindBy(xpath = "//input[contains(@value,'Cancel  ')]") private WebElement cancelButton;
	

	public UsersPage(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}


	public WebElement getCreateNewUserButton() {
		return createNewUserButton;
	}


	public WebElement getUsernameTB() {
		return usernameTB;
	}


	public WebElement getPasswordTB() {
		return passwordTB;
	}


	public WebElement getRetypePasswordTB() {
		return retypePasswordTB;
	}


	public WebElement getFirstNmaeTB() {
		return firstNmaeTB;
	}


	public WebElement getLastNmaeTB() {
		return lastNmaeTB;
	}


	public WebElement getWorkDayDuration() {
		return workDayDuration;
	}


	public WebElement getModifyTimeTrackChkBox() {
		return modifyTimeTrackChkBox;
	}


	public WebElement getManageCustomerAndProjectsChkBox() {
		return manageCustomerAndProjectsChkBox;
	}


	public WebElement getManageUsersChkBox() {
		return manageUsersChkBox;
	}


	public WebElement getManagebillingtypesChkBox() {
		return managebillingtypesChkBox;
	}


	public WebElement getGenrateReportsChkBox() {
		return genrateReportsChkBox;
	}


	public WebElement getCreateuserButton() {
		return createuserButton;
	}


	public WebElement getCancelButton() {
		return cancelButton;
	}
	
	public void createNewUser(String usn ,String pwd , String fname ,String lastname) throws InterruptedException
	{
		usernameTB.sendKeys(usn);
		Thread.sleep(1000);
		passwordTB.sendKeys(pwd);
		Thread.sleep(1000);
		retypePasswordTB.sendKeys(pwd);
		Thread.sleep(1000);
		firstNmaeTB.sendKeys(fname);
		Thread.sleep(1000);
		lastNmaeTB.sendKeys(lastname);
		Thread.sleep(1000);
		modifyTimeTrackChkBox.click();
		manageCustomerAndProjectsChkBox.click();
		manageUsersChkBox.click();
		managebillingtypesChkBox.click();
		genrateReportsChkBox.click();
		createuserButton.click();
		
	}


}
