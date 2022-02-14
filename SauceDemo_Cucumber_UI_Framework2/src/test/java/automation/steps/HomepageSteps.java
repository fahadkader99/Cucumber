package automation.steps;

import automation.pages.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomepageSteps {

    HomePage homePage = new HomePage();


    @Then("verify user is on homepage")
    public void verify_user_is_on_homepage() {
        homePage.verifyUserAtHomePage();
    }

    @When("user click on item {string}")
    public void user_click_on_any_item(String itemName) {
        homePage.clickOnItem(itemName);
    }

    @When("user click on item Sauce Labs Bike Light")
    public void user_click_on_item_sauce_labs_bike_light() {
        homePage.clickOnItemBikeLight();
    }

    @Then("user click on item Sauce Labs Bolt T-Shirt")
    public void user_click_on_item_sauce_labs_bolt_t_shirt() {
        homePage.clickOnItemT_shirt();
    }

    @Then("user clicks on homepage cart icon")
    public void user_clicks_on_homepage_cart_icon() {
        homePage.clickOnCartButtonHomePage();
    }
    @When("user click on add to cart button for item {string}")
    public void user_click_on_add_to_cart_button_for_item(String itemName) {
        homePage.clickOnAddToCartForSpecificItem(itemName);

    }

}
