package automation.steps;

import automation.pages.HomePage;
import automation.utils.DataBaseUtils;
import automation.utils.DriverUtils;
import automation.utils.PropertyReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebElement;

import javax.xml.crypto.Data;

public class Hooks {

    @Before("@db")
    public void setDB(){
        DataBaseUtils.createDB_Connection();
    }


    @Before
    public void setUp(){
        PropertyReader.initProperties();


        String platform = PropertyReader.getProperty("platform");

        if (platform.equals("local")){
            DriverUtils.createDriver();
        }
        else if(platform.equals("saucelab")){
            DriverUtils.create_SauceLab_Driver();
        }
        else if (platform.equals("browserstack")){
            DriverUtils.create_BrowserStack_Driver();
        }
        else {
            throw new RuntimeException("Invalid Platform Selected in @Before Hooks / check driver settings. ");
        }

    }

    @After("@db")
    public void closeDB(){
        DataBaseUtils.closeDB_Connection();
    }


    @After
    public void cleanUp(Scenario sc){


        byte[] data = CommonMethods.takeScreenShot();
        sc.attach(data, "image/png", "My screenshot");

        // in this app if i close the app without logging out, the access will be locked for the account
        HomePage homePage = new HomePage();
        homePage.userLogout();

        DriverUtils.getDriver().quit();
    }

}
