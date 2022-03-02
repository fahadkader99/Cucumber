Feature: This feature is to test the ability of the user to manage users Savings account and
  to see account balance and transactions


  Background:
    Given user open website
    Then  verify user is on the Login page
    When  user click on login button
    Then  verify user is navigated to Home page.


  Scenario Outline: Verify user is able to view Transaction Table
    When user clicks on "savings" dropdown
    Then and verify "<SavingsMenu>" are displayed
    Examples:
      | SavingsMenu  |
      | view-savings |
      | new-savings  |


  Scenario: Verify user is able to see there Account Transaction
    When user clicks on "savings" dropdown
    And  select "view-savings"
    Then verify user is redirected to the View Savings Page
    When user can see "MySaving" box on the page
    Then verify on button is toggled on
    And  also verify user is able to see the current balance on the box

  Scenario: user is able to see View Savings page Transactions
    When user clicks on "savings" dropdown
    And  select "view-savings"
    Then verify user is redirected to the View Savings Page
    And  verify Transactions table are displayed

  Scenario Outline: Verify Multiple Headers are displayed under transaction table
    When user clicks on "savings" dropdown
    And  select "view-savings"
    Then verify user is redirected to the View Savings Page
    And  verify user is able to see "<header>"
    Examples:
      | header      |
      | Date        |
      | Category    |
      | Description |
      | Amount      |
      | Balance     |


  Scenario: Verify at least one Saving Account is active for the user
    When user clicks on "savings" dropdown
    And  select "view-savings"
    Then verify user is redirected to the View Savings Page
    And  verify on off button is displayed on MySaving box
    Then verify  on button is selected

  Scenario: Verify User transaction history is displayed
    When user clicks on "savings" dropdown
    And  select "view-savings"
    Then verify user is redirected to the View Savings Page
    And  verify user is able to see the Transactions table on the page



