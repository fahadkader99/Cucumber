Feature: This feature is to test functionality related to Home Page

  Developer
  Tester

  Reviewed by

  Background:
    Given user open website
    Then verify user is on the Login page
    When user logs in
    Then verify user is navigated to Home Page

@Smoke
    Scenario: Verify user is able to see Welcome message
    Then verify welcome message displayed on right top header

#  Scenario: Verify Home title
#    When user is checking panel on the left
#    Then user should be able to see "Home" title
#
#  Scenario: Verify Banking Accounts title
#    When user is checking panel on the left
#    Then user should be able to see "BANKING ACCOUNTS" title is present
#
#
#  Scenario: Verify Checking category under Banking Accounts
#    When user is checking panel on the left
#    Then user should be able to see "Checking" category under Banking Accounts
#
#  Scenario: Verify Savings category under Banking Accounts
#    When user is checking panel on the left
#    Then user should be able to see "Savings" category under Banking Accounts
#
#  Scenario: Verify External category under Banking Accounts
#    When user is checking panel on the left
#    Then user should be able to see "External" category under Banking Accounts
#
#
#  Scenario: Verify Transactions/Transfers title and categories
#    When user is checking panel on the left below Banking Accounts
#    Then verify "TRANSACTIONS/ TRANSFERS" title is present
#    And user should be able to see "Deposit" category
#    And user should be able to see "Withdraw" category
#    And user should be able to see "Transfer Between Accounts" category
#    And user should be able to see "VISA Direct Transfer" category
#
#
#
#
#
#
#
#
#
