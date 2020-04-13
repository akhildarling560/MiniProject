@invalidLogin
Feature: JPetStoreInvalidLogin
	
	
  Scenario Outline: Validating Login Page With InValid Details
  
    Given open browser and start application
    When  I enter invalid "<usernameNumber>"
    Then  user unable to login
    Then  application should be closed
    
    Examples: 
      | usernameNumber |
      | 2							 |
      