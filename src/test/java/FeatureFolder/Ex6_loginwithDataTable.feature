Feature: openning multiple account
  Scenario: S13_Opening account using data from datatable
    Given user on account opening page
    When user enter following details
    |FN|LN|Email|MobNo|
    |swati|yadav|sy@gmail.com|12345|
    |priti|kale|pk@gmail.com|42345|
    |savita|rane|sr@gmail.com|52345|
    |suman|swant|ss@gmail.com|62345|
   And click on submit button
    Then account open successfully

