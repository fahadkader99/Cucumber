package com.automation.steps;

import com.automation.pages.GooglePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Google_Steps {
    GooglePage googlePage = new GooglePage();

    @When("user open websites")
    public void user_open_websites() {
        googlePage.userOpenWebsite();
    }
    @When("send his name on google")
    public void send_his_name_on_google() {
        googlePage.userSendHisName();
    }
    @Then("user click on search button")
    public void user_click_on_search_button() {
        googlePage.userClickSearchBtn();
    }



}
