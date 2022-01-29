Feature: Checks that the expression parser is working correctly

  Scenario: Basic Addition
    Given that the user has entered "3 + 4"
    When I evaluate their expression
    Then I should get a result of 7

  Scenario: Order of operations
    Given that the user has entered "3 - 9 / 3"
    When I evaluate their expression
    Then I should get a result of 0