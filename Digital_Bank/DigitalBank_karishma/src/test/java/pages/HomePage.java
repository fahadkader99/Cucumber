package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.DriverUtils;

public class HomePage  {
    @FindBy(xpath = "//a[@class='navbar-brand']/img")
    public WebElement homePageImgEle;
    @FindBy(xpath = "//img[@class='user-avatar rounded-circle']")
   public  WebElement userImgRightTopEle;
    @FindBy(xpath = "//i[@class='fa fa-power -off']")
    WebElement logOutEle;
    @FindBy(xpath = "//li[@class='active']")
    public WebElement welcomeMsgEle;

    WebDriver driver;

  public HomePage()
    {
        this.driver = DriverUtils.getDriver();
        PageFactory.initElements(driver, this);
    }

    public void logOut()
    {
        userImgRightTopEle.click();
        logOutEle.click();
    }
    public void verifyUserOnHomePage()
    {

        Assert.assertTrue(homePageImgEle.isDisplayed(), "HomePage Element is missing");
    }
//public void verifyWelcomeMessage()
//{
//Assert.assertTrue(welcomeMsgEle.getText(),);
//}

}
