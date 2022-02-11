package com.automation.step;

import com.automation.pages.HomePage;
import io.cucumber.java.en.Then;

public class HomePageSteps {
    HomePage homePage = new HomePage();

    @Then("verify welcome message displayed on right top header")
    public void verifyWelcomeMessageDisplayedOnRightTopHeader() {
        homePage.verifyWelcomeMessage();
    }

    @Then("verify user is navigated to Home Page")
    public void verifyUserIsNavigatedToHomePage() {
        homePage.verifyHomePage();
    }
}
