package automation.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features/UN1HomePage.feature","src/test/resources/features/UN2CheckingAccount.feature","src/test/resources/features/UN3ManageCheckingAccount.feature"},
        glue = "automation.steps",
        tags = "@Regression",
        plugin = {"pretty","json:target/cucumber.json", "html:target/index.html"}


)


public class TestRunner1 {

}
