  #Author
  #Date
  #Description



@SmokeFeature
Feature: Feature to test login functionality

  @smoketest
  Scenario: Check login succcessful with valid credenctials

    Given user is on login page
    When user enter username and password
    And  clicks on login Button
    Then  user is navigated to the home page


