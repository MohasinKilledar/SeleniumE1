package KeywordDriven2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TasksPage {

	@FindBy(xpath = "//a[text()='Projects & Customers']")
	private WebElement projectsAndCutomersLink;
	@FindBy(xpath = "//input[@value='Create New Customer']") 
	private WebElement createNewCustomersBtn;
	@FindBy(xpath = "//input[@name='name']")
	private WebElement customerNameTB;
	@FindBy(xpath = "//input[@name='createCustomerSubmit']")
	private WebElement createCustomerBtn;
	@FindBy(xpath = "//input[contains(@value,' Cancel  ')]")
	private WebElement createCustCancelBtn;
	@FindBy(xpath = "//input[@value='Create New Project']")
	private WebElement createNewprojectBtn;
	@FindBy(name = "customerId")
	private WebElement selectCustomerdropdown;
	@FindBy(xpath = "//input[@name='name']")
	private WebElement projectnameTB;
	@FindBy(xpath = "//input[@value='Create Project']")
	private WebElement createProjectBtn;
	@FindBy(xpath = "//input[contains(@value,' Cancel  ')]")
	private WebElement createProjectCancelBtn;
	@FindBy(xpath = "//a[text()='All']")
	private WebElement allCustomerAndProjectsLink;
	@FindBy(xpath = "//input[@value='Delete Selected']")
	private WebElement deleteSelectedBtn;
	@FindBy(xpath = "//input[@value='Archive Selected']")
	private WebElement archiveSelectedBtn;
	@FindBy(id = "deletebutton")
	private WebElement deleteThisCustPopUps;

	
	
	
	public TasksPage(WebDriver driver)
	{
		
		PageFactory.initElements( driver , this);
	}




	public WebElement getProjectsAndCutomersLink() {
		return projectsAndCutomersLink;
	}




	public WebElement getCreateNewCustomersBtn() {
		return createNewCustomersBtn;
	}




	public WebElement getCustomerNameTB() {
		return customerNameTB;
	}




	public WebElement getCreateCustomerBtn() {
		return createCustomerBtn;
	}




	public WebElement getCreateCustCancelBtn() {
		return createCustCancelBtn;
	}




	public WebElement getCreateNewprojectBtn() {
		return createNewprojectBtn;
	}




	public WebElement getSelectCustomerdropdown() {
		return selectCustomerdropdown;
	}




	public WebElement getProjectnameTB() {
		return projectnameTB;
	}




	public WebElement getCreateProjectBtn() {
		return createProjectBtn;
	}




	public WebElement getCreateProjectCancelBtn() {
		return createProjectCancelBtn;
	}




	public WebElement getAllCustomerAndProjectsLink() {
		return allCustomerAndProjectsLink;
	}




	public WebElement getDeleteSelectedBtn() {
		return deleteSelectedBtn;
	}




	public WebElement getArchiveSelectedBtn() {
		return archiveSelectedBtn;
	}




	public WebElement getDeleteThisCustPopUps() {
		return deleteThisCustPopUps;
	}
	
	public void createNewCustomerMethod(String customerName)
	{
		projectsAndCutomersLink.click();
		createNewCustomersBtn.click();
		customerNameTB.sendKeys(customerName);
		createCustomerBtn.click();
	}
	public void createNewProjectMethod(String projectName , String customerName )
	{
		projectsAndCutomersLink.click();
		createNewprojectBtn.click();
		projectnameTB.sendKeys(projectName);
		
		Select sel = new Select(selectCustomerdropdown);
		sel.selectByVisibleText(customerName);
		createProjectBtn.click();
	}
	public void deleteAllCustAndProjectMethod()
	{
		projectsAndCutomersLink.click();
		allCustomerAndProjectsLink.click();
		deleteSelectedBtn.click();
		deleteThisCustPopUps.click();
		
	}
	
}
