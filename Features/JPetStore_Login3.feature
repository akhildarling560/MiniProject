@multipleitems
Feature: JPetStoreLogin with multiple cart items
	
	
  Scenario Outline: Adding multiple items to cart and making payment
  
    Given open browser and start application
    When  I enter valid "<usernameNumber>"
    When  user able to login
    Then  user selects an item from menu
    Then  user selects multiple items
    Then  payment has to be done
    Then  user has to sign out
    Then  application should be closed
    
    Examples: 
      | usernameNumber |
      | 1							 |
      