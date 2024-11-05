@calculator
Feature: Calculator Functionality

 // Background:
  //  Given I have entered the number 10 into the calculator

  @add
  Scenario: Subtracting two numbers
    Given I have entered the number 10 into the calculator
    When I pres the "add" button
    And I have entered another number 5 into th calculator
    Then the result displayed should be 5

  @sub
  Scenario: Subtracting two numbers
    Given I have entered the number 10 into the calculator
    When I pres the "subtract" button
    And I have entered another number 5 into th calculator
    Then the result displayed should be 5

@outline
  Scenario Outline: Adding two numbers
    Given I have entered the number <number> into the calculator
    When I pres the <op> button
    And I have entered another number <number1> into th calculator
    Then the result displayed should be <expectedResult>
    Examples:
    | number  | op          | number1 | expectedResult  |
    | 10      | "add"       | 5       | 15              |
    | 10      | "subtract"  | 5       | 5              |
    | 20      | "add"       | 5       | 25              |
    | 20      | "subtract"  | 5       | 15              |
