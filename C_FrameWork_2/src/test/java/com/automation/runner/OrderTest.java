package com.automation.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/Order.feature"},
        glue = {"com.automation.stepDef","myHooks"},
        tags = "@Regression",
        plugin = {"pretty"}

)


public class OrderTest {
}
