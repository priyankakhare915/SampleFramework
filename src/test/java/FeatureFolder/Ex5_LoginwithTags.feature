@regression
Feature: login with tags

  Background:
    Given user on login page
@sanity
  Scenario: s6_login with valid credential
    When user enter valid username
    And user enter valid password
    And click on login button
    Then user redirect on home page
@sanity
  Scenario: s7_login with invalid credential
      When user enter valid username
      And user enter invalid password
      And click on login button
      Then login failed msg visible
@smoke
  Scenario: s8_login with test data
        When user enter username "priya"
        And user enter password "abcd"
        And user enter pin 1234
       And click on login button
        Then home page visible with logo "homepage" text
@performance
  Scenario Outline: S9_login with multiple text data
    When user enter username "<UN>"
    And user enter password "<PSW>"
    And user enter pin <pin>
    And click on login button
    Then home page visible with logo "google" text


          Examples:
            |UN|PSW|pin|
            |priya|123|456|
            |supriya|a23|56|
            |kriya|b23|6|
