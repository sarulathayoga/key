Feature: This is to test search google
Scenario:  Google search scenario
	Given user is entering google.co.in
		When user is typing the searchj term "sarulatha"
		And enters the return key
		Then the user should see the search results