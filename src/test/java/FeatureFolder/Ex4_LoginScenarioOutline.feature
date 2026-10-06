Feature: Login to app using scenario outline
  @smoke
Scenario Outline: s5-login to app using scenario outline
  Given user on login page
  When user enter username "<userName>"
  And user enter password "<password>"
  And user enter pin <pin>
  And click on login button
  Then user redirect on home page
  Examples:
  |userName| password| pin|
  |abc     |123      |908 |
  |cds     |sdff     |456 |
  |dfg     |dfg      |678 |