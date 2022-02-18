package com.automation.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class loginSteps {
    @Given("User open websites")
    public void user_open_websites() {

    }
    @Given("user is on login Page")
    public void user_is_on_login_page() {

    }
    @When("user enters username {string} and Password {string}")
    public void user_enters_username_and_password(String string, String string2) {

    }
    @When("click on login button")
    public void click_on_login_button() {

    }
    @Then("verify user is navigated to the homepage")
    public void verify_user_is_navigated_to_the_homepage() {

    }

    @When("User enters invalid username and invalid password")
    public void user_enters_invalid_username_and_invalid_password() {

    }
    @Then("verify user is not allowed to login")
    public void verify_user_is_not_allowed_to_login() {

    }
    @Then("user gets massage {string} provided.")
    public void user_gets_massage_provided(String string) {

    }
    @When("User enters invalid username and valid password")
    public void user_enters_invalid_username_and_valid_password() {

    }
    @Then("user is back to the login page")
    public void user_is_back_to_the_login_page() {

    }
    @When("user enter username {string} and password {string}")
    public void user_enter_username_and_password(String string, String string2) {

    }
    @When("clicks on the login button")
    public void clicks_on_the_login_button() {

    }
    @Then("verify invalid login error message {string} is displayed")
    public void verify_invalid_login_error_message_is_displayed(String string) {

    }
    @Then("verify user is navigated to homepage")
    public void verify_user_is_navigated_to_homepage() {

    }
    @Then("verify the below data table are shown")
    public void verify_the_below_data_table_are_shown(DataTable dataTable) {

        List<List<String >> data = dataTable.asLists();
        for (int i = 0 ; i<data.size();i++){
            for (int j = 0; j<data.get(i).size();j++){
                System.out.println(data.get(i).get(j)+" ");
            }
            System.out.println();
        }
        System.out.println("\n");
    }
    @When("user clicks on user badge icon")
    public void user_clicks_on_user_badge_icon() {

    }
    @When("select on layout option")
    public void select_on_layout_option() {

    }
    @When("user is still on the login page")
    public void user_is_still_on_the_login_page() {

    }
    @Then("verify another table data are also shown")
    public void verify_another_table_data_are_also_shown(DataTable dataTable) {
        List<String>data = dataTable.asList();
        for (int i = 0; i<data.size();i++){
            System.out.println(data.get(i));
        }
        System.out.println("\n");
    }


}
