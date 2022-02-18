@All
Feature: This Feature is to test the Login-In Functionality.

  Dev - Ash
  Tester - Kader


  Background:
    Given User open websites
    And user is on login Page
    When user enters username "admin" and Password "admin123"
    And click on login button

  Scenario: Verify user is able to login with valid credentials
    Given User open websites
    And user is on login Page
    When user enters username "admin" and Password "admin123"
    And click on login button
    Then verify user is navigated to the homepage

  @Smoke
  Scenario: user enters invalid credentials, user should not be allowed to login

    Then verify user is not allowed to login
    And user gets massage "invalid credentials" provided.

  @Regression
  Scenario: user enters valid username and invalid password, user should npt be allowed to login
    Then verify user is not allowed to login
    And user is back to the login page


    # Data driven test cases

  @Data1
  Scenario Outline: verify user is unable to login with invalid credentials
    When user enter username "<username>" and password "<password>"
    And clicks on the login button
    Then verify invalid login error message "Invalid Credential" is displayed
    Examples:
    |username     |password|
    |Abcd         |1234    |
    |admin        |ad123   |
    |invalidAdmin |123123  |



    # Data driven using data Table
  @DataTable
  Scenario: verify user is able to see the web table data
    Then verify user is navigated to homepage
    And verify the below data table are shown
      | Airi Satou         | Accountant                    | Tokyo         | 33 | 2008/11/28 |
      | Angelica Ramos     | Chief Executive Officer (CEO) | London        | 47 | 2009/10/09 |
      | Ashton Cox         | Junior Technical Author       | San Francisco | 66 | 2009/01/12 |
      | Bradley Greer      | Software Engineer             | London        | 41 | 2012/10/13 |
      | Brenden Wagner     | Software Engineer             | San Francisco | 28 | 2011/06/07 |
      | Brielle Williamson | Integration Specialist        | New York      | 61 | 2012/12/02 |
    When user clicks on user badge icon
    And select on layout option
    When user is still on the login page
    Then verify another table data are also shown
      | Airi Satou         |
      | Angelica Ramos     |
      | Bradley Greer      |
      | Brenden Wagner     |
      | Brielle Williamson |


