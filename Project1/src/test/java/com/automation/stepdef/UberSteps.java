package com.automation.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UberSteps {

    @Given("User wants to select a car type {string} from uber app")
    public void user_wants_to_select_a_car_type_from_uber_app(String carType) {
        System.out.println("Step 1 Car type " + carType);

    }
    @When("User select car {string} and pick up point {string} and drop location {string}")
    public void user_select_car_and_pick_up_point_and_drop_location(String carType, String pickupLocation, String dropLocation) {
        System.out.println("Step 2 Car type " + carType + " pickup from  "+ pickupLocation+ " drop off at "+ dropLocation);
    }
    @Then("Driver starts the journey")
    public void driver_starts_the_journey() {
        System.out.println("Step 3");
    }
    @Then("Driver ends the journey")
    public void driver_ends_the_journey() {
        System.out.println("Step 4");
    }
    @Then("User pays {int} USD")
    public void user_pays_usd(Integer price) {
        System.out.println("Step 5 Fair = "+ price);
    }
}
