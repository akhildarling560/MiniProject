@search
Feature: JPetStoreLogin searching an item and purchasing
	
	
  Scenario Outline: searching an item and making payment
  
    Given open browser and start application
    When  I enter valid "<usernameNumber>"
    When  user able to login
    Then  user searches for an item
    Then  payment has to be done
    Then  user has to sign out
    Then  application should be closed
    
    Examples: 
      | usernameNumber |
      | 1							 |
      