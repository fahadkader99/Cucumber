package com.automation.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/UberBook.feature"},
        glue = {"com.automation.stepDef","myHooks"},
        plugin = {"pretty"}

)




public class UberTest {
}
