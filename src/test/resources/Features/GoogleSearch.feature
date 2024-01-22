Feature: Amazon website automation testing
  
 
  Scenario: Validate instagram login is working
    Given User is on instagram page
    When User enters username and password
    And hits login button
    Then User should go to respective results page

 # This is to understand step parameters
  Scenario Outline: Validate google search is working
    Given User is on google search page
    When User enters <query> in search box of google
    And hits enter button of google
    Then User should go to respective page of google

	Examples:
		| query |
		|automation step by step |
	
    
