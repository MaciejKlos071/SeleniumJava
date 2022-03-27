package SwagLabs_test.Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CssSelectorsTest {
    @Test
    public void FindElements(){
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.saucedemo.com/");

        By cssByIdLoginName = By.cssSelector("#user-name");
        driver.findElement(cssByIdLoginName);
        By cssByClass = By.cssSelector(".submit-button.btn_action");
        driver.findElement(cssByClass);
        By cssByTag = By.cssSelector("input");
        driver.findElement(cssByTag).sendKeys("wartosc");
        By cssName = By.cssSelector("[name='password']");
        driver.findElement(cssName).sendKeys("password");
        By cssClass2 = By.cssSelector("[class = 'bot_column']");
        driver.findElement(cssClass2);
//        driver.close();
    }
}
