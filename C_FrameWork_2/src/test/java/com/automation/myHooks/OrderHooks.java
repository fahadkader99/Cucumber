package com.automation.myHooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class OrderHooks {

    @Before
    public void setUp(){
        System.out.println("Opening the App");
    }
    @After
    public void closeUp(){
        System.out.println("Closing the App");
    }

    @BeforeStep("@Regression")
    public void firstTask(){
        System.out.println("Take screenshot");
    }
    @AfterStep("@Regression")
    public void lastTask(){
        System.out.println("Refresh the page");
    }



}
