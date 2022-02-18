package automation.steps;

import automation.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_Steps {

    LoginPage loginPage = new LoginPage();

    @Given("user open website")
    public void user_open_website() {
        loginPage.openWebsite();
    }

    @Then("verify user is on the Login page")
    public void verify_user_is_on_the_login_page() {
        loginPage.verifyLoginPage();
    }

    @When("user click on login button")
    public void user_click_on_login_button() {
        loginPage.doLogin();
    }





}
