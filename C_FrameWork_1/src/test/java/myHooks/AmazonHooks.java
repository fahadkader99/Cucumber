package myHooks;

import io.cucumber.java.*;

public class AmazonHooks {

    @Before("@Smoke")
    public void setUp_App(Scenario sc){
        System.out.println("Launch Amazon application");
        System.out.println("Scenario : "+sc.getName());
    }
//    @Before(order = 2)
//    public void setUp_Url(){
//        System.out.println("Launch the Url");
//    }
    @After("@Smoke")
    public void tearDown1(){
        System.out.println("Logout from application");
    }
//    @After(order = 1)
//    public void tearDown2(Scenario sc){
//        System.out.println("Close the application");
//        System.out.println("Scenario : "+sc.getName());
//    }
//    @BeforeStep
//    public void takeScreenShot(){
//        System.out.println("Take the screenshot");
//    }
//    @AfterStep
//    public void refreshPage(){
//        System.out.println("Refresh the page");
//    }


}
