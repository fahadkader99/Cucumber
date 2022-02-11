package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.DriverUtils;
import utils.PropertyReader;

public class LoginPage                            {
    @FindBy(id = "username")
    WebElement userNameEle;
    @FindBy(id = "password")
    WebElement passwordEle;
    @FindBy(id = "submit")
    WebElement submitBtnEle;
    @FindBy(id = "remember-me")
    WebElement rememberMeChkBxEle;
    @FindBy(xpath = "//div[@class='register-link m-t-15 text-center']/p/a")
    WebElement signUpLinkEle;
    @FindBy(xpath = "//div[@class='login-logo']/a/img")
    WebElement loginPageImgEle;


    WebDriver driver;
    public LoginPage()
    {
        this.driver = DriverUtils.getDriver();
        PageFactory.initElements(driver, this);
    }


    public void doLogin()
    {
        userNameEle.sendKeys(PropertyReader.getProperty("login.username"));
        passwordEle.sendKeys(PropertyReader.getProperty("login.password"));

    }

    public void verifyUserOnLoginPage()
    {
        Assert.assertTrue(loginPageImgEle.isDisplayed(), "Login Page is displayed");
    }
    public void signIn()
    {
        submitBtnEle.click();
    }
    public void signUp()
    {
        signUpLinkEle.click();
    }

}
