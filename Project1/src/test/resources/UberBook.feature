@All
Feature: Uber Booking Feature

  @Smoke
  Scenario: Booking Cab for Camry
    Given User wants to select a car type "Camry" from uber app
    When User select car "Camry" and pick up point "Bronx" and drop location "Manhattan"
    Then Driver starts the journey
    And Driver ends the journey
    Then User pays 100 USD

  @Regression
  Scenario: Booking Cab for Rav4
    Given User wants to select a car type "Rav4" from uber app
    When User select car "Rav4" and pick up point "Queens" and drop location "Manhattan"
    Then Driver starts the journey
    And Driver ends the journey
    Then User pays 200 USD

  @Production
  Scenario: Booking Cab for 4Runner
    Given User wants to select a car type "4Runner" from uber app
    When User select car "4Runner" and pick up point "Bronx" and drop location "Manhattan"
    Then Driver starts the journey
    And Driver ends the journey
    Then User pays 300 USD