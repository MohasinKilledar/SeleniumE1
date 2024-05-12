package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks {

	@Before("@netBanking")
	public void netBankingSetup()
	{
		System.out.println("**********************************************");
		
		System.out.println("setup the entries in netBanking database");
		
	}
	@After
	public void tearDown()
	{
		System.out.println("Clear The Enteries");
		
	}
	@Before("@mortgage")
	public void mortgagesetUP() 
	{
		System.out.println("setup the entries in Mortgage database");
		
	}
}
//Before ->Backgroud ->Scenario -> After