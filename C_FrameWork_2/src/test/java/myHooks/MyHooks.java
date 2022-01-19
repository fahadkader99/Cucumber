package myHooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class MyHooks {

    @Before("@Smoke")
    public void setUp(){
        System.out.println("Setting up the App");
    }

//    @After("@Regression")
//    public void closeUp(){
//        System.out.println("Closing up the App");
//    }
//    @BeforeStep
//    public void takeScreenShot(){
//        System.out.println("Taking Screen Shot");
//    }
//    @AfterStep("@Smoke")
//    public void pageRefresh(){
//        System.out.println("Refreshing Page");
//    }
}
