package com.automation.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/UberBook.feature"},
        glue = ("com.automation.stepdef"),
        tags ="@All",
        plugin = {"pretty",
                "json:target/MyReports/report.json",
                "junit:target/MyReports/report.xml"},
        monochrome = true,
        dryRun = true



)


public class UberBookTest {

}
