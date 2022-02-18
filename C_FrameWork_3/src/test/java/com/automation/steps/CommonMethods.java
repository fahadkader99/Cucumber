package com.automation.steps;


import com.automation.utils.DriverUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class CommonMethods {

    public static byte[] takeScreenShot(){

        byte[] srcFile = ((TakesScreenshot) DriverUtils.getDriver()).getScreenshotAs(OutputType.BYTES);

        return srcFile;
    }


}
