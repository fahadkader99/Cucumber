package digitalBank;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class test2 {

    @Test
    public  void main() throws InterruptedException{

        System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(59));

        driver.get("http://3.129.60.236:8080/bank/login");

        // log in or Background
        WebElement login = driver.findElement(By.id("username"));
        login.sendKeys("ash@gmail.com");
        WebElement pass = driver.findElement(By.id("password"));
        pass.sendKeys("Java12345[]");
        WebElement signIn = driver.findElement(By.xpath("//button[@id='submit']"));
        signIn.click();


        //  Verify available options under Checking section ("View Checking" and "New Checking" )
        WebElement checkingMenu = driver.findElement(By.xpath("//a[@id='checking-menu']"));
        checkingMenu.click();
        Thread.sleep(2000);

        WebElement subMenu = driver.findElement(By.xpath("//ul[@class='sub-menu children dropdown-menu show']"));
        Select select = new Select(checkingMenu);
        select.selectByVisibleText("View Checking");













    }
}
