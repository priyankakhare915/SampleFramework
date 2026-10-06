Feature: Login to app by test data feature
Scenario:s2_login by test data from feature
  Given user on login page
  When user enter username "abcd"
  And user enter password "xyz"
  And user enter pin 1234
  And  click on login button
  Then home page visible with logo "absghhj" text