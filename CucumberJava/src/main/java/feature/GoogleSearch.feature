Feature: Check google search functionality

  Scenario: Validate google search is working
    Given browser is open
    And user is on google search page
    When user enter a text in search box
    And hits the enter button
    Then user is navigated to search result

