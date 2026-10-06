Feature: Login to app using Background Keyword

  Background:
    Given user on login page
    When user enter valid username

  Scenario:S3_login with valid credential
    When user enter valid password
    And click on login button
    Then user redirect on home page

@smoke
    Scenario:S4_login with invalid credential
      When user enter invalid password
      And click on login button
      Then login failed msg visible