Feature: Search data product SHOPQA

  Scenario: Search data product web
    When User go to web 
    And User click button search
    And User enter <input> data search
    Then System check credentials data search

    Examples: 
      | input |
      | black |
      | pink  |
      | dress |
