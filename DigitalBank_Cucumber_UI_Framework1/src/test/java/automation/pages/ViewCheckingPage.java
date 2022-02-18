package automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ViewCheckingPage extends BasePage{

    @FindBy(xpath = "//h1[@id='page-title']")
    public WebElement viewCheckingPageTitle;

}
