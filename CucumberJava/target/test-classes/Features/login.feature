Feature: feature to test login functionality

	@smoketests
  Scenario: Check login successful with valid credentials
    Given User is on login page
    When User enters username and password
    And Clicks on login button
    Then User is navigated to the home page