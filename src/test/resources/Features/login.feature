Feature: feature to test login functionality

  Scenario: Check login successful with valid credentials
    Given User is on login page of xyz website
    When User enters username and password of xyz website
    And Clicks on login button of xyz website
    Then User is navigated to the home page of xyz website