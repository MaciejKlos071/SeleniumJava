package testowankoNG;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;

public class sampleTestListener implements ITestListener {


        @Override
        public void onTestStart(ITestResult iTestResult) {

        }

        @Override
        public void onTestSuccess(ITestResult iTestResult) {

        }

        @Override
        public void onTestFailure(ITestResult iTestResult) {
                WebDriver driver = DriverFactory.getDriver();
                int number = (int)(Math.random()*10000);
                TakesScreenshot screenshot = (TakesScreenshot) driver;
                File before = screenshot.getScreenshotAs(OutputType.FILE);
                String fileName = "FailedTest" + number +".png";
                try {
                        FileUtils.copyFile(before, new File("src/test/resources/" + fileName));
                } catch (IOException e) {
                        e.printStackTrace();
                }
        }

        @Override
        public void onTestSkipped(ITestResult iTestResult) {

        }

        @Override
        public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

        }

        @Override
        public void onStart(ITestContext iTestContext) {

        }

        @Override
        public void onFinish(ITestContext iTestContext) {

        }
}
