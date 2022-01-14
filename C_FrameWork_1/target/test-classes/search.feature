Feature: Amazon Search

  # https://www.youtube.com/watch?v=t54-83glFaM&list=PLFGoYjJG_fqpObjigKg4bunu6_Ki7Ppn-&index=11
@Smoke
  Scenario: Search a Product MacBook pro
    Given I have a search field on Amazon Page
    When I search for a product with name "Apple Macbook Pro" and price 2000
    Then Product with the name "Apple Macbook Pro" should be displayed
    Then Order id is 12345 and username is"Fahad"

@Regression
  Scenario: Search a Product Iphone
    Given I have a search field on Amazon Page
    When I search for a product with name "Iphone" and price 1200
    Then Product with the name "Iphone" should be displayed
    Then Order id is 1245 and username is"FahadKader"
