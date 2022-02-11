package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utils.DriverUtils;

public abstract class  BasePage {

        WebDriver driver;

        BasePage()
        {
            this.driver = DriverUtils.getDriver();
            PageFactory.initElements(driver, this);
        }
    }


