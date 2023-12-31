Feature: This feature is to validate the basic functionality of Swag lab application
	As a end customer,
	when tries to purchase the product in swaglab application
	should be able to complete the shopping the successfully

@test-one
Scenario: Login with the customer account to validate total cart amount
	Given I open a browser and navigate to swaglab application
	Given I use username and password to login to swaglab application
	And I select a product named SauceLabs Backpack
	And I review the selected product
	And I proceed with product checkout
	And I enter the personal information
	Then I review the selected product details 
	
	
	
