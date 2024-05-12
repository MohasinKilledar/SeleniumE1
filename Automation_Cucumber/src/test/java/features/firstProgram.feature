Feature: Application Login



Background:
Given setup the entries in database
When launch the browser from config varibale
And hit the home page url of banking site

  @smokeTest
  Scenario: admin page default login
    Given user is landing on ActiTime Login page
    When user login into application with username "admin" and password "admin"
    Then Home page is displayed
   
#Reusable
@smokeTest @regressionTest
Scenario: user page default login
    Given user is landing on ActiTime Login page
    When user login into application with username king and password kohli@12.3
    Then Home page is displayed
    
    
   @mobileTest
Scenario Outline: Invalid login credentials
    Given user is landing on ActiTime Login page
    When user login into application with username "<Username>" and password "<Password>"
    Then Home page is displayed
    
    Examples:
    | Username | Password |
    | admin | pwd |
    | pwd | admin |
    | debit | hello@123 |
    | credit | pass@123 |

@smokeTest @regressionTest
Scenario: user page default signup
    Given user is on Practice landing page
    When user signup into application
    | Mohasin |
    | Killedar |
    | contact@gmail.com|
    |9876543210|
    Then Home page is displayed
    
   

