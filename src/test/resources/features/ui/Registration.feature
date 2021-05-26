@UI
Feature: As a user I want to be able to register successfully

  Scenario: Successful registration with correct data
    Given I go to the SUT home page
    And I click on the registration button
    When I enter first name "Krasio"
    And I enter surname "Todorov"
    And I enter email "kra@abv.bg"
    And I input password "pass1234"
    And I enter country "Bulgaria"
    And I enter city "Sofia"
    And I agree to the terms of service
    And I click on the register button
    Then I should see that I am successfully registered