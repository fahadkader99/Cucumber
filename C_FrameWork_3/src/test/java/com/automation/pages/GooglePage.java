package com.automation.pages;

import com.automation.utils.PropertyReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GooglePage extends BasePage{


    @FindBy(xpath = "//input[@class='gLFyf gsfi']")
    WebElement searchBox;

    @FindBy(xpath = "//div[@class='FPdoLc lJ9FBc']/center/input[@value='Google Search']")
    WebElement searchButton;




    public void userOpenWebsite() {
        driver.get(PropertyReader.getProperty("app.url"));
    }

    public void userSendHisName() {
        searchBox.sendKeys(PropertyReader.getProperty("name"));
    }

    public void userClickSearchBtn() {
        searchButton.click();
    }
}
