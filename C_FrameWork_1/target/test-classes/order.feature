@All
Feature: Amazon Order Page
  In order to check my order details
  As a registered user
  I want to specify the features of order details page

  Background:     // all repetitive steps that all the scenario follows stay here
    Given a registered user exists
    Given user is on Amazon login page
    When user enters username
    And user enters password
    And user clicks on login button
    Then user navigates to order page



  Scenario: Check Previous Order Details
    When user clicks on previous order link
    Then user checks the previous order details


  Scenario: Check Open Order Details
    When user clicks on open order link
    Then user checks the open order details

  Scenario: Check Cancelled Order Details
    When user clicks on cancelled order link
    Then user checks the cancelled order details