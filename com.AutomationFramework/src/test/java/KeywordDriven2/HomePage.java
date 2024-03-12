package KeywordDriven2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	
	@FindBy(xpath ="//div[text()='Time-Track']/..//img")private WebElement  timeTrackModule;
	@FindBy(xpath ="//div[text()='Tasks']/following-sibling::img") private WebElement tasksModule;
	@FindBy(xpath="//div[text()='Reports']/following-sibling::img")private WebElement reportsmodule;
	@FindBy(xpath="//div[text()='Users']/following-sibling::img")private WebElement usersModule;
	@FindBy(xpath = "//div[text()='Work Schedule']/following-sibling::img") private WebElement workScheduleModule;
	@FindBy(xpath = "//div[text()='Settings']/following-sibling::img")private WebElement settingsModule;
	@FindBy(xpath="//a[text()='Logout']") private WebElement logoutlink;
	
	


	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}


	public WebElement getTimeTrackModule() {
		return timeTrackModule;
	}


	public WebElement getTasksModule() {
		return tasksModule;
	}


	public WebElement getReportsmodule() {
		return reportsmodule;
	}


	public WebElement getUsersModule() {
		return usersModule;
	}


	public WebElement getWorkScheduleModule() {
		return workScheduleModule;
	}


	public WebElement getSettingsModule() {
		return settingsModule;
	}
	public WebElement getLogoutlink() {
		return logoutlink;
	}
	
	
	
	
}
