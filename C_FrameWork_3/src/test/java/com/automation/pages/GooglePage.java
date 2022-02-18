package com.automation.pages;

import com.automation.utils.PropertyReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GooglePage extends BasePage{


    @FindBy(xpath = "//input[@title='Search']")
    public WebElement searchBox;

    @FindBy(name = "btnK")
    public WebElement searchBtn;











    public void userOpenWebsite() {
        driver.get(PropertyReader.getProperty("app.url"));
    }

    public void userSendHisName() {
        searchBox.sendKeys(PropertyReader.getProperty("name"));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void userClickOnSearchButton() {
        searchBtn.click();
    }
}
