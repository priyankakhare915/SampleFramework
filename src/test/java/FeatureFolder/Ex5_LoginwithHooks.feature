Feature: Login to app using hooks
@abc
  Scenario: s10_login to app using valid credential
    Given user on login page
    When user enter username "keshav"
    And user enter password "1234"
    And click on login button
    Then home page visible with logo "gmail" text

    Scenario: s11_loin with invalid credential
      Given user on login page
      When user enter valid username
      And user enter invalid password
      And click on login button
      Then login failed msg visible