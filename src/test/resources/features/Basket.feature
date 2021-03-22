
Feature: Basket Functionality

  Background:
    Given User able to go to website
    And user should able to hover over account area
    And user should able to click login button
    Then user should be able to see login page
    When the user enters "username"  "password"
    Then user should be on the main page


  Scenario Outline: User should be able to put some product on your basket
    And user should able to write "<productName>" on the searching area
    And user should able to click search icon
    Then user should able to see result page
    And user should able to see related product
    And user should able to click random item
    Then user should be able to on the pdp
    And user should be able to add product on your basket
    And user should able to click basket icon
    Then user should see same product

    Examples:
      | productName |
      | televizyon  |
      | kumanda     |
      | pil         |