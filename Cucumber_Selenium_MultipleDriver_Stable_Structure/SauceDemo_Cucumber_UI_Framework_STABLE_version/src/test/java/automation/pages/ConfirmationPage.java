package automation.pages;


import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ConfirmationPage extends Base_Page{

    @FindBy(className = "title")
    WebElement completeTitle;

    @FindBy(className = "complete-header")
    WebElement confirmationTitle;

    @FindBy(className = "complete-text")
    WebElement orderCompleteText;


    public void verifyOrderConfirmationPage(){
        Assert.assertTrue("Complete title is missing from confirmation page", completeTitle.isDisplayed());

        String actual = confirmationTitle.getText();
        String expected = "THANK YOU FOR YOUR ORDER";
        Assert.assertEquals(actual,expected);

    }


    public void printOderCompleteMessage(){
        System.out.println("\n\n"+orderCompleteText.getText());
    }



}
