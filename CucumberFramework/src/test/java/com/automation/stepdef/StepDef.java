package com.automation.stepdef;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class StepDef {
    @Given("user open websites")
    public void user_open_websites() {

    }
    @Given("user is on login page")
    public void user_is_on_login_page() {

    }
    @When("user enters username {string} and Password {string}")
    public void user_enters_username_and_password(String string, String string2) {

    }
    @When("click on login button")
    public void click_on_login_button() {

    }
    @Then("verify user is navigated to homepage")
    public void verify_user_is_navigated_to_homepage() {

    }
    @Given("User open website")
    public void user_open_website() {

    }
    @Given("User is on the login page")
    public void user_is_on_the_login_page() {

    }
    @When("User enters invalid username and invalid password")
    public void user_enters_invalid_username_and_invalid_password() {

    }
    @When("Click on the login button")
    public void click_on_the_login_button() {

    }
    @Then("Verify user is not allowed to login")
    public void verify_user_is_not_allowed_to_login() {

    }

    @Given("User open desired website")
    public void user_open_desired_website() {

    }
    @Given("user is on the login")
    public void user_is_on_the_login() {

    }
    @When("User leaves the username or password field empty")
    public void user_leaves_the_username_or_password_field_empty() {

    }
    @When("User leaves the username blank or password field blank")
    public void user_leaves_the_username_blank_or_password_field_blank() {

    }
    @Then("Verify user is not allowed to login to the webpage")
    public void verify_user_is_not_allowed_to_login_to_the_webpage() {

    }
    @When("user hover mouse on PIM menu")
    public void user_hover_mouse_on_pim_menu() {

    }
    @When("click on Add Employee Link")
    public void click_on_add_employee_link() {

    }
    @Then("verify user is navigated to add employee page")
    public void verify_user_is_navigated_to_add_employee_page() {

    }
    @When("user enters valid details on add employee page")
    public void user_enters_valid_details_on_add_employee_page() {

    }
    @When("click on save button")
    public void click_on_save_button() {

    }
    @Then("verify user is navigate to personal detail page.")
    public void verify_user_is_navigate_to_personal_detail_page() {

    }

    @Then("verify error message for missing first name and last name")
    public void verify_error_message_for_missing_first_name_and_last_name() {

    }

    @When("user enter username {string} and password {string}")
    public void user_enter_username_and_password(String string, String string2) {

    }
    @Then("verify invalid login error message {string} is displayed")
    public void verify_invalid_login_error_message_is_displayed(String string) {

    }

    @Then("Verify table has the below data")
    public void verify_table_has_the_below_data(DataTable dataTable) {
        List<List<String>> data = dataTable.asLists();
        //System.out.println(data.get(2).get(1));
        // 2 is the 3rd row and 1 is the second data, since position starts with 0

        for (int i = 0; i <data.size(); i++){
            for (int j = 0; j <data.get(i).size(); j++){
                System.out.print(data.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
    @When("user clicks on user badge icon")
    public void user_clicks_on_user_badge_icon() {

    }
    @When("select on logout option")
    public void select_on_logout_option() {

    }
    @Then("Verify another table data")
    public void verify_another_table_data(DataTable dataTable) {
        List<String> data = dataTable.asList();

        for (String str : data){
            System.out.println(str);
        }

    }


}
