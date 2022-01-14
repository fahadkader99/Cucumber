@All
Feature: Amazon Order Page
  In order to check my order details
  As a registered user
  I want to specify the features of order details page.

  Background:
    Given A registered exits
    Given user is on Amazon login page
    When user enters username
    And user enters password
    And user clicks on login button
    Then user navigates to order page


  @Smoke
  Scenario: Check Previous Order Details
    When user clicks on previous order link
    Then user checks the previous order details


  @Regression
  Scenario: Check Open Order Details
      When user clicks on open oder link
      Then user checks the open order details


  @Smoke
  Scenario: Check Cancelled Order Details
    When user clicks on cancelled order link
    Then user checks the cancelled order details
