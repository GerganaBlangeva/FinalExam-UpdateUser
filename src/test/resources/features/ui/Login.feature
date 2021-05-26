@UI
Feature: As a user I want to be able to login successfully

  Scenario: Successful login with correct credentials
    Given I go to the SuT home page
    When I enter username "admin@automation.com"
    And I enter password "pass123"
    And I click on the login button
    Then I should see that I am successfully logged in