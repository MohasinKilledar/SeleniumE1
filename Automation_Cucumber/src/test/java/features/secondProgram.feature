Feature: Application Login



Background:

When launch the browser from config varibale
And hit the home page url of banking site

#//Before ->Backgroud ->Scenario -> After
  
@regressionTest @netBanking
Scenario: user page default login

    Given user is landing on netBanking Login page
    When user login into application with username "king" and password 0953
    Then Home page is displayed
    And Cards are displayed
    
    
   @smokeTest @regressionTest @mortgage
Scenario Outline: Mortgage user page default login
    Given user is landing on netBanking Login page 
    When user login into application with username "<Username>" and password "<Password>"
    Then Home page is displayed
    And Cards are displayed
    Examples:
    | Username | Password |
    | debituser | hello12 |
    | credituser | admin1233 |
    

    
   

