Feature:  This feature file s to test end to end flow of the website

  Scenario: Verify User Click Add To Cart Button
    Given user open websites
    When user do login
    Then verify user is on homepage
    When user click on add to cart button for item "Sauce Labs Onesie"


    # here i am learning how to dynamically choose add to cart button for any item when passing through the parameter.
  # in runtime the item will be changed, here choosing the dynamic xpath is very important.