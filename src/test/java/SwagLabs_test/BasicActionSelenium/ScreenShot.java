package SwagLabs_test.BasicActionSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.IOException;

public class ScreenShot {
    public void ScreenShoot() throws IOException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("Some link to web");
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File scrFile = screenshot.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("src/test/resources/screenshot.png"));
    }
}
