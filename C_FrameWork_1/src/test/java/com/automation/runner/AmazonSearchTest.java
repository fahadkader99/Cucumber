package com.automation.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

//        features = {"src/test/resources/search.feature","src/test/resources/search.feature"},
//        glue = {"com.automation.stepdef", "myHooks"},
//          tags = "@Smoke",        // tag do not take {}
//        plugin = {"pretty"}     // plugin for better visual in the console with proper output.

        features = {"src/test/resources/search.feature"},
        glue = {"com.automation.stepdef", "myHooks"},       // what if i have 2 class file with different hooks files
        tags = "@Smoke or @Regression",
        plugin = {"pretty"}

)

public class AmazonSearchTest {



}
        