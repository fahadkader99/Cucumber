package com.automation.stepdef;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setup(){
        // this will execute before each scenario. depending on the number of scenario.

    }
    @After
    public void cleanup(){
        // this will execute after each scenario
    }

}
