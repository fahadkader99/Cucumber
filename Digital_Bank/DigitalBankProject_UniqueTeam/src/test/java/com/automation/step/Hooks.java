package com.automation.step;

import com.automation.utils.DriverUtils;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
    @Before
    public void setUp(){
        DriverUtils.createDriver();

    }

    @After
    public void cleanUp(){
        DriverUtils.getDriver().quit();
    }
}
