package stepdef;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pages.HomePage;
import pages.LoginPage;
import utils.PropertyReader;

import java.util.List;
import java.util.Set;


public class StepDefinitionUN1 {
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    @Given("user opens {string}")
    public void user_opens(String string) {
      loginPage.verifyUserOnLoginPage();
           }
    @Given("user is on login page")
    public void user_is_on_login_page() {
       loginPage.verifyUserOnLoginPage();
    }
    @When("user enters username {string} and password {string}")
    public void user_enters_username_and_password(String string, String string2) {
       loginPage.doLogin();
    }
    @When("click on login button")
    public void click_on_login_button() {
       loginPage.signIn();
    }
    @Then("verify user is navigated to the homepage")
    public void verify_user_is_navigated_to_the_homepage() {
       homePage.verifyUserOnHomePage();
    }

    @Then("user should be able to see {string}")
    public void user_should_be_able_to_see(String welcomeMessage) {
        Assert.assertEquals(welcomeMessage, homePage.welcomeMsgEle.getText());
    }
    @When("user checks right top header")
    public void user_checks_right_top_header() {
       
    }

    @When("user is checking panel on the left")
    public void user_is_checking_panel_on_the_left() {
       
    }

    @Then("user should be able to see {string} title")
    public void user_should_be_able_to_see_title(String string) {
       
    }
    @Then("user should be able to see {string} title is present")
    public void user_should_be_able_to_see_title_is_present(String string) {
       
    }
    @Then("user should be able to see {string} category under Banking Accounts")
    public void user_should_be_able_to_see_category_under_banking_accounts(String string) {
       
    }
    @When("user is checking panel on the left below Banking Accounts")
    public void user_is_checking_panel_on_the_left_below_banking_accounts() {
       
    }

    @Then("verify {string} title is present")
    public void verify_title_is_present(String string) {
       
    }

    @Then("user should be able to see {string} category")
    public void user_should_be_able_to_see_category(String string) {
       
    }



}
