Feature: Searching Functionality

  Background:
    Given User able to go to website
    And user should able to hover over account area
    And user should able to click login button
    Then user should be able to see login page
    When the user enters "username"  "password"
    Then user should be on the main page

  @smoke
  Scenario Outline: User should able to search some item
    And user should able to write "<productName>" on the searching area
    And user should able to click search icon
    Then user should able to see result page
    And user should able to see related product

    Examples:
      | productName |
      | selenium    |
      |             |
      | *?)-%       |
      | 89098       |




