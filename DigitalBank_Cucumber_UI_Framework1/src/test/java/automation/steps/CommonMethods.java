package automation.steps;

import automation.utils.DriverUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class CommonMethods {

    public static byte[] takeScreenShot(){

        byte[] srcFile = ((TakesScreenshot) DriverUtils.getDriver()).getScreenshotAs(OutputType.BYTES);

        return srcFile;
    }


}
