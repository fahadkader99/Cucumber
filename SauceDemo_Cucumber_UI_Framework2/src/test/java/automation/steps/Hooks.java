package automation.steps;

import automation.utils.DriverUtils;
import automation.utils.PropertyReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class Hooks {


    @Before
    public void setUp() {
        String platform = PropertyReader.getProperty("platform");

        if (platform.equals("local")){
            DriverUtils.createDriver();
        }
        else if (platform.equals("saucelab")){
            DriverUtils.create_SauceLab_Driver();
        }
        else if (platform.equals("browserstack")){
            DriverUtils.create_BrowserStack_Driver();
        }
        else {
            throw new RuntimeException("Invalid Platform Selected. ");
        }
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
    public void cleanUp(Scenario sc) {
        byte[]data = CommonMethods.takeScreenshot();                    // attaching the screenshot at the end of the test with the html report (not saving in the local pc!!!)
        sc.attach(data, "image/png", "My screenshot");
        DriverUtils.getDriver().quit();
    }

}
