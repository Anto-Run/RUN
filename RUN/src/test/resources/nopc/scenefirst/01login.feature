Feature: Login User NOPC

  Scenario: User invalid login
    When User go to Web NOPC
    And User enter invalid email and password
    And User click button login
    Then User invalid credentials
    

  Scenario: User valid login
    When User go to Web NOPC
    And User enter valid email and password
    And User click button login valid
    Then User valid credentials