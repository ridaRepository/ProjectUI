Feature: Logout Functionality
  Background:
    Given User able to go to website
    And user should able to hover over account area
    And user should able to click login button
    Then user should be able to see login page
    When the user enters "username"  "password"


  Scenario: User should able to logout
    Then user should be on the main page
    And user should able to hover over account area
    And user should be able to click logout button
    Then user should be able to login page