Feature: Login functionality for adactin application

Scenario: user enter valid username and valid password
	Given user enter url of adactin application
	When user enter "ansari1234" as username
	And user enter "ansari@123" as password
	And user click the login button
	Then user validate login button