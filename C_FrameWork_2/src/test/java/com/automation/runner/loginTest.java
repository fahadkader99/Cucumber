package com.automation.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/login.feature"},
        glue = {"com.automation.stepDef"},
        tags = " @DataTable",
        plugin = {"html:target/cucumber.html","json:target/cucumber.json"}
)



public class loginTest {
}
