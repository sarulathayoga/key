Feature: This is the login feature for orange HRM
Scenario: This is login scenario
	Given user is on login page
	When the user enters the valid "Admin" and "admin123"
	And clicks on the login button
	Then the user should be navigated to home page
