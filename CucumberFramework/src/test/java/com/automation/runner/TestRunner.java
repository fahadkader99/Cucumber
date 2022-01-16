package com.automation.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = {"src/test/resources/AddEmployee.feature", "src/test/resources/login.feature"},
        glue = "com.automation.stepdef",
        tags = "@Smoke",
        plugin = {"html:target/cucumber.html","json:target/cucumber.json"}



        // by using tags we can separate out tests


)


public class TestRunner {

}


