Feature: Login Functionality

 @s
  Scenario Outline: User should able to login with valid credential - Happy Path
    Given User able to go to website
    And user should able to hover over account area
    And user should able to click login button
    Then user should be able to see login page
    When the user enters "<username>" and "<password>"
    Then user should be on the main page

    Examples:
      | username             | password |
      | denizokan0@gmail.com | 121120   |


  #Couple of possible scenarios;

  #     invalid username - valid password
  #
  #     valid username   - invalid password
  #
  #     invalid username - invalid password


  Scenario: User should NOT able to login with invalid credential
    Given User able to go to website
    And user should able to hover over account area
    And user should able to click login button
    Then user should be able to see login page
    When the user enters invalid "username" "password"
    Then user should able to see warning message on the screen