Feature: This Feature is to test the Login Functionality

  Dev - Ash
  Tester - Fahad
  Review by - Jahan

  @Smoke
  Scenario: Verify user can able to login with valid credentials
    Given user open websites
    And user is on login page
    When user enters username "admin" and Password "admin123"
    And click on login button
    Then verify user is navigated to homepage

  Scenario: User enters invalid credentials, user should not allowed to login
    Given User open website
    And User is on the login page
    When User enters invalid username and invalid password
    And Click on the login button
    Then Verify user is not allowed to login

    @Smoke
  Scenario: User enters blank credentials, error message is diplayed.
    Given User open desired website
    And user is on the login
    When User leaves the username or password field empty
    And User leaves the username blank or password field blank
    Then Verify user is not allowed to login to the webpage


  # Data driven test case.
  @Regression
  Scenario Outline: Verify user is unable to login with invalid credentials
    When user enter username "<username>" and password "<password>"
    And clicks on the login button
    Then verify invalid login error message "Invalid Credential" is displayed.
    Examples:
      | username     | password|
      | invalidadmin | 12345678|
      | Admin        | 12345678|
      |              |         |
      |invalidadmin  | admin123|
      | admin        | Admin123|


    # Data diven test by passing data table
  @DataTable
  Scenario: Verify User is able to see the web table data
    Given user open websites
    And user is on login page
    When user enters username "admin" and Password "admin123"
    And click on login button
    Then verify user is navigated to homepage
    Then Verify table has the below data
      | Airi Satou         | Accountant                    | Tokyo         | 33 | 2008/11/28 |
      | Angelica Ramos     | Chief Executive Officer (CEO) | London        | 47 | 2009/10/09 |
      | Ashton Cox         | Junior Technical Author       | San Francisco | 66 | 2009/01/12 |
      | Bradley Greer      | Software Engineer             | London        | 41 | 2012/10/13 |
      | Brenden Wagner     | Software Engineer             | San Francisco | 28 | 2011/06/07 |
      | Brielle Williamson | Integration Specialist        | New York      | 61 | 2012/12/02 |
    When  user clicks on user badge icon
    And select on logout option
    Then user is on login page
    Then Verify another table data
      | Airi Satou         |
      | Angelica Ramos     |
      | Bradley Greer      |
      | Brenden Wagner     |
      | Brielle Williamson |

