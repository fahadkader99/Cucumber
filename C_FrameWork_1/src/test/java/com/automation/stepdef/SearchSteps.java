package com.automation.stepdef;

import implementation.Product;
import implementation.Search;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SearchSteps {

    Product product;
    Search search;

    @Given("I have a search field on Amazon Page")
    public void i_have_a_search_field_on_amazon_page() {
        System.out.println("Step 1: I am on search page");

    }
    @When("I search for a product with name {string} and price {int}")
    public void i_search_for_a_product_with_name_and_price(String productName, Integer price) {
        System.out.println("Step 2: Search the product with name: "+ productName + " price "+ price);

        product = new Product(productName, price);  // constructor from implementation
    }

    @Then("Product with the name {string} should be displayed")
    public void product_with_the_name_should_be_displayed(String productName) {
        System.out.println("Step 3: Product "+ productName + " is displayed ");

        search = new Search();
        String name = search.displayProduct(product);
        System.out.println("Searched product is: "+ name);

        //Assert.assertEquals(product.getProductName(), name);
    }
    @Then("Order id is {int} and username is\"Fahad\"")
    public void order_id_is_and_username_is_fahad(Integer price) {

    }
    @Then("Order id is {int} and username is\"FahadKader\"")
    public void order_id_is_and_username_is_fahad_kader(Integer int1) {

    }

}
