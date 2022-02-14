package automation.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Base_Page {

    @FindBy(xpath = "//div[@class='app_logo']")
    WebElement homePageLogo;

    @FindBy(xpath = "//span[@class='title']")
    WebElement homePageTitle;

    @FindBy(xpath = "//div[@class='inventory_item_name'][contains(text(),'Sauce Labs Bike Light')]")
    WebElement bikeLightLink;

    @FindBy(xpath = "//div[@class='inventory_item_name'][contains(text(),'Sauce Labs Bolt T-Shirt')]")
    WebElement T_shirtLink;

    @FindBy(id = "react-burger-menu-btn")
    WebElement burgerMenu;

    @FindBy(id = "logout_sidebar_link")
    WebElement logoutLink;

//    @FindBy(xpath = "//div[text()='Sauce Labs Backpack']")
//    WebElement itemLink;

    String Xpath_ITEM_LINK = "//div[text()='%s']";      // %s will find the item based on what value we pass on the feature file

    String Xpath_Item_Add_To_Cart_Btn = "//div[text()='%s']/ancestor::div[@class='inventory_item_description']//button";




    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    WebElement cartBtn;


    public void verifyUserAtHomePage(){
        Assert.assertTrue("Home page logo is not displayed", homePageLogo.isDisplayed());
        Assert.assertTrue("Home page title is not displayed", homePageTitle.isDisplayed());
    }

    public void clickOnItemBikeLight(){
        bikeLightLink.click();
    }

    public void clickOnItemT_shirt(){
        T_shirtLink.click();
    }

    public void clickOnBurgerMenu(){
        burgerMenu.click();
    }

    public void clickOnLogoutLink(){
        logoutLink.click();
    }

    public void clickOnItem(String itemName) {                          // Dynamically finding the item.
        String locator = String.format(Xpath_ITEM_LINK,itemName);           // Handling locator Dynamically
        WebElement itemLink = driver.findElement(By.xpath(locator));
        itemLink.click();
    }

    public void clickOnCartButtonHomePage(){
        cartBtn.click();
    }

    public void clickOnAddToCartForSpecificItem(String itemName) {
        String locator = String.format(Xpath_Item_Add_To_Cart_Btn,itemName);
        WebElement addToCartBtn = driver.findElement(By.xpath(locator));
        addToCartBtn.click();
    }
}
