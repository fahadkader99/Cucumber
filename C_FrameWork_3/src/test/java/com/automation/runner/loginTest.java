package com.automation.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/login.feature"},
        glue = {"com.automation.stepDef","com.automation.hooks"},
        tags = "@DataTable",
        plugin = {"pretty","html:target/cucumber.html","json:target/cucumber.json"}


)

public class loginTest {
}
// for generating online report i am using

/*
Plugin on xml :

maven-cucumber-reporting
version: 3.4.0
 */