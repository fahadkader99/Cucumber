
Feature: Amazon Order Page
  In order to check my oder details As a registered user I want to specify the features of order details page.


  Background:
    Given a registered user exists
    Given user is on Amazon login page
    When user enters username
    And user enters password
    And user clicks on login button
    Then user navigates to order page

  Scenario: Check Previous Order Details

    When User clicks on previous Order Link
    Then User checks the previous order details

  @Regression
  Scenario: Check Open Order Details

    When user clicks on open order link
    Then user checks the open order details


  @Smoke
  Scenario: Check Cancel Order Details

    When user clicks on open order details
    Then user checks the cancelled order details


