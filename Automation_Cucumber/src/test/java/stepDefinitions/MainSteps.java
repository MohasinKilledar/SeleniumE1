package stepDefinitions;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainSteps {

	@Given("user is landing on ActiTime Login page")
	public void user_is_landing_on_acti_time_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("User Landed on Actitime login page");
	}
	@Given("user is on Practice landing page")
	public void user_is_on_practice_landing_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user is on Practice landing page");
	}
	@Given("user is landing on netBanking Login page")
	public void user_is_landing_on_net_banking_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	@When("user signup into application")
	public void user_signup_into_application(List<String> data) {
	  System.out.println(data.get(0)); 
	  System.out.println(data.get(1)); 
	  System.out.println(data.get(2)); 
	  System.out.println(data.get(3)); 
	  
	}
	
//	@When("user login into application with username {string} and password {string}")
//	public void user_login_into_application_with_and_password(String username, String password) {
//	    // Write code here that turns the phrase above into concrete actions
//		System.out.println("username is " +username+ " and password is " +password);
//	}
	
	//Regex pattern
	@When("^user login into application with username (.+) and password (.+)$")
	public void user_login_into_application_with_and_password(String username, String password) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("username is " +username+ " and password is " +password);
	}
	@Then("Home page is displayed")
	public void home_page_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Home page is displayed");
	}
	@Then("Cards are displayed")
	public void cards_are_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}
	@Given ("setup the entries in database")	
	public void setupEntries()
	{
		
		System.out.println("****************************************");
		System.out.println("setup the entries in database");
	}
	@When ("launch the browser from config varibale")
	public void launchBrowser()
	{
		
		System.out.println("launch the browser from config varibale");
		
	}
	@When ("hit the home page url of banking site")
	public void homePage()
	{
	
		System.out.println("hit the home page url of banking site");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}