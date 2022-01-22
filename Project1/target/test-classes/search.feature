Feature: Amazon Search

  # https://www.youtube.com/watch?v=t54-83glFaM&list=PLFGoYjJG_fqpObjigKg4bunu6_Ki7Ppn-&index=11

  Scenario: Search a Product
    Given I have a search field on Amazon Page
    When I search for a product with name "Apple Macbook Pro" and price 1000
    Then Product with the name "Apple Macbook Pro" should be displayed
