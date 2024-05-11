
Feature: Application Login


  
  Scenario: admin page default login
    Given user is landing on ActiTime Login page
    When user login into application with username "admin" and password "admin"
    Then Home page is displayed
   
#Reusable

Scenario: user page default login
    Given user is landing on ActiTime Login page
    When user login into application with username "king" and password "kohli@123"
    Then Home page is displayed
    
    
   
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

   

