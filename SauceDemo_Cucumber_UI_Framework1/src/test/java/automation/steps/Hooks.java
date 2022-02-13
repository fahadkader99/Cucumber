package automation.steps;

import automation.utils.DriverUtils;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hooks {


    @Before
    public void setUp() {
        DriverUtils.createDriver();
    }
    @Before("@Assignment")
    public void startUp1(){
        System.out.println("\nRunning the Home Based Assignment Test");
    }
    @Before("@Smoke")
    public void startUp2(){
        System.out.println("\nRunning the Smoke test");
    }

    @Before("@Regression")
    public void startUp3(){
        System.out.println("\nRunning the Regression Suit from TestNG Project");
    }

    @After("@Assignment")
    public void cleanUp1(){
        System.out.println("Closing up Home_Assignment");
    }

    @After("@Smoke")
    public void cleanUp2(){
        System.out.println("Smoke test Ends, See the Cucumber Report...!");
    }

    @After("@Regression")
    public void cleanUp3(){
        System.out.println("TestNG Regression Suite complete. ");
    }

    @After
    public void cleanUp() {
        DriverUtils.getDriver().quit();
    }

}
