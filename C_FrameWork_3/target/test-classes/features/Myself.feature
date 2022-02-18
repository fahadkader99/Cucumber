Feature: This feature is to verify user can do whatever he want

  Scenario: Verify user can search his name on google
    When user open websites
    And send his name on google
    Then user click on search button