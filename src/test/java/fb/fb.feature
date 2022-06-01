Feature: login fb
Scenario: the user has to enter fb
	Given the user has to enter "username" and " password"
	When the user has to login
	Then invalid mail should display