package com.automation.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/order.feature"},
        glue = {"com.automation.stepdef","com.automation.myHooks"},
        tags = "@All",
        plugin = {"pretty"}
)


public class OrderTest {
}






// @Before order goes in Ascending

// @After order goes in Descending

// Q> How can i have multiple hooks file in the package and link them on the glue?