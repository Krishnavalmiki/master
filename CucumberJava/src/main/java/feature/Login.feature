#Author
#Date
#Description

#@SmokeScenatio
Feature: To test login functionality

	@SmokeTest
  Scenario: Check login is successful with valid credentials
  
  	Given user is on login page
    When user enter username and password
    And click on login button
    Then user is navigated to home page

  #Scenario Outline: Check login is successful with valid credentials
    #Given user is on login page
    #When user enter <username> and <password>
    #And click on login button
    #Then user is navigated to home page
#
    #Examples: 
      #| username | password |
      #| user1    | pass1    |
      #| user2    | pass2    |
