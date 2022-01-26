package com.automation.hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class MyHooks {

    @Before("@Regressiom")
    public void setUp(){
        System.out.println("Setting up the App");
    }
    @After("@Smoke")
    public void closeUp(){
        System.out.println("Closing the App");
    }

    @Before("@DataTable")
    public void setDataTable(){
        System.out.println("Data Table Stats");
    }
    @After("@DataTable")
    public void closeDataTable(){
        System.out.println("Stopping Data Table");
    }
//    @BeforeStep("@DataTable")
//    public void takeScreenShot(){
//        System.out.println("Taking Screenshot");
//    }
//    @AfterStep("@DataTable")
//    public void refreshPage(){
//        System.out.println("Reload WebPage");
//    }


}
