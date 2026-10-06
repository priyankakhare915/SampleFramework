Feature: Login to app
  Scenario: Login with valid credential
    Given user on login page
    When user enter valid username
    And user enter valid password
    And click on login button
    Then user redirect on home page
