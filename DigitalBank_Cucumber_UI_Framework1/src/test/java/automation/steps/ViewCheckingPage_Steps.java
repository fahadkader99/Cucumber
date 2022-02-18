package automation.steps;

import automation.pages.ViewCheckingPage;
import io.cucumber.java.en.And;
import org.junit.Assert;

public class ViewCheckingPage_Steps {

    ViewCheckingPage viewCheckingPage = new ViewCheckingPage();


    @And("verify user is redirected to the View Checking page")
    public void verifyUserIsRedirectedToTheViewCheckingPage() {
        Assert.assertTrue("View checking page is not available yet", viewCheckingPage.viewCheckingPageTitle.isDisplayed());
    }

}
