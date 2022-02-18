package automation.pages;

import automation.utils.PropertyReader;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(id = "submit")
    public WebElement signInBtn;

    @FindBy(id = "username")
    public WebElement userNameBox;

    @FindBy(id = "password")
    public WebElement passwordBox;





    public void doLogin(){
        userNameBox.sendKeys(PropertyReader.getProperty("login.username"));
        passwordBox.sendKeys(PropertyReader.getProperty("login.password"));
        signInBtn.click();
    }



    public void openWebsite(){
        driver.get(PropertyReader.getProperty("app.url"));
    }

    public void verifyLoginPage(){
        Assert.assertTrue("Sign in Button is missing ", signInBtn.isDisplayed());
    }

}
