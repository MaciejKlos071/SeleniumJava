package SwagLabs_test.Test;

import SwagLabs_test.Locators.Locator;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Test {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.saucedemo.com/");
        Assert.assertTrue(driver.getCurrentUrl().equals("https://www.saucedemo.com/") );
        Locator loc = new Locator();
        By userNameByID = loc.LoginByID_Input;
        System.out.println("ok");
        driver.close();
    }
}
