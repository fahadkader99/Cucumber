Feature: This feature is for Adding Employee on the webpage.

#https://opensource-demo.orangehrmlive.com/index.php/auth/login



  Scenario: After login user is able to add employee to the employee list.
    Given user open websites
    And user is on login page
    When user enters username "admin" and Password "admin123"
    And click on login button
    Then verify user is navigated to homepage
    When user hover mouse on PIM menu
    And click on Add Employee Link
    Then verify user is navigated to add employee page
    When user enters valid details on add employee page
    And click on save button
    Then verify user is navigate to personal detail page.

  Scenario: Verify error message for missing first name and last name.
    Given user open websites
    And user is on login page
    When user enters username "admin" and Password "admin123"
    And click on login button
    Then verify user is navigated to homepage
    When user hover mouse on PIM menu
    And click on Add Employee Link
    Then verify user is navigated to add employee page
    When click on save button
    Then verify error message for missing first name and last name