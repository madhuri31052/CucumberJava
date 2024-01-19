Feature: Feature to test google functionality

  
  Scenario: Validate google search is working
    Given User is on google search page
    When User enters something in search box
    And hits enter button
    Then User should go to respective page

