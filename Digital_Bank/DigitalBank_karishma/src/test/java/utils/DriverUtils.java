package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.lang3.ObjectUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class DriverUtils {
    static WebDriver driver;

    public static void createDriver()
    {
        //System.setProperty("webdriver.chrome.driver", "src//test//resources//driver//chromedriver.exe");
       // driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximazied");
        driver = new ChromeDriver(options);
        driver.get(PropertyReader.getProperty("app.url"));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();


    }

    public static WebDriver getDriver()
    {
        if(driver == null)
           createDriver();
        return driver;
    }
}
