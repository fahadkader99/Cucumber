Feature:  User Registration

# learning Data_table handling in Cucumber BDD.

  Scenario: user registration with different data
    Given User is on registration page
    When User enters following user details
    | naven | automation  |   nav@gmail.com | 9999  |   Banglore  |
    | Ash   | kader       |   ash@gmail.com | 1234  |   Bronx     |
    | kader | fahad       |   test@gmail.com| 4422  |  Booklyn    |
    Then user registration should be successful
