Feature: Application test for deal page test

Scenario: user able to create new deal

Given user is on home
When user clicks on deals tab and select New deal option
And user lands on Deal Page
Then user enter deal details and save
And verify new deal created successfully