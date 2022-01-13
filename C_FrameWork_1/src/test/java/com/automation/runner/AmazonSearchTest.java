package com.automation.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = {"src/test/resources/search.feature","src/test/resources/addEmployee.feature"},
        glue = {"com.automation.stepdef"},
        plugin = {"pretty"}     // plugin for better visual in the console with proper output.
)

public class AmazonSearchTest {



}
