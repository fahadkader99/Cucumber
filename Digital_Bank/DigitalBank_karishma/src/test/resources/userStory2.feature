Feature: This feature is to test if the User is able to view all details in account home page.

  Developer - Karishma
  Tester - Elena
  Reviewed By - Tetiana

  Background:
    Given user opens website
    And user is on login page
    When user enters username "karishma@testemail.com" and password "Digital123"
    And click on login button
    Then verify user is navigated to homepage
    When user is on the homepage


  Scenario: Verify if User is able to view Welcome message on the right top header
    Then verify Welcome (<First_name>) on the right top header
    And  user closes the browser


    Scenario Outline: Verify if User is able to create Checking account
      When user clicks on "New Checking"
      Then User is navigated to URL
      Then  select "<Account Type>"
      And select "<Ownership>"
      And provide <Account Name>
      And <Initial Deposit Amount>
      And click on submit

      Examples:
      Account Type | Ownership
      Standard Checking | Individual
      Standard Checking | Joint
      Interest Checking | Individual
      Interest Checking | Joint

