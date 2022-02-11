package com.automation.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy (xpath = "//div/h1[@id = 'page-title']")
    WebElement dashboardTitle;

    @FindBy (xpath = "//div[@class = 'col-sm-8']/div/div/ol/li[contains(text(), 'Welcome')]")
    WebElement welcomeMessage;

    public void verifyHomePage(){
        Assert.assertTrue("Please check whether you are on the home page.", dashboardTitle.isDisplayed());
    }

    public void verifyWelcomeMessage(){
        Assert.assertTrue("Check on welcome message", welcomeMessage.isDisplayed());
    }
}
