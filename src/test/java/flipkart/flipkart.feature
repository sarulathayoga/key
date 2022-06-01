Feature: flipkart login
Scenario: go to flipkart page
	Given cancel login page
	When serach for the "product"
	And product should display
	Then product should match for the selected product