
Feature: Facebook Login page
  I want to use this template for my feature file

  @displayed
  Scenario: Verify login page
    Given Open Facebook application
    Then Verify Email texbox is displayed
    And Verify Password textbox is displayed
    And Close application
