Feature: Calculator Functionality

  Scenario: Adding two numbers
    Given I have entered the number 10 into the calculator
    When I pres the add button
    And I have entered another number 5 into th calculator
    Then the result displayed should be 15