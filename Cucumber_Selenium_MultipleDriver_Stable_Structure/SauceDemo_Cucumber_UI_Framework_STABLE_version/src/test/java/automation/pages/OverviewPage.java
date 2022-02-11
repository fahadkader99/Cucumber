package automation.pages;


import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class OverviewPage extends Base_Page{

    @FindBy(xpath = "//span[@class='title']")
    WebElement overViewPageTitle;

    @FindBy(className = "cart_desc_label")
    WebElement productDescription;

    @FindBy(className = "summary_info_label")
    WebElement shippingInfo;

    @FindBy(xpath = "//button[@id='finish']")
    WebElement finishBtn;



    public void verifyOverViewPage(){
        Assert.assertTrue("Overview page title is missing", overViewPageTitle.isDisplayed());
        Assert.assertTrue("Overview description is not matching.", productDescription.isDisplayed());
        Assert.assertTrue("Shipping info is not displayed in Overview page", shippingInfo.isDisplayed());
    }

    public void clickFinishButton(){
        finishBtn.click();
    }








}
