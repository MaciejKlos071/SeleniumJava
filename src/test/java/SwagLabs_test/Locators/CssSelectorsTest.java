package SwagLabs_test.Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

public class CssSelectorsTest {
    @Test
    public void FindElements(){
        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions options = new FirefoxOptions();
        options.setHeadless(true);

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
        By cssall = By.cssSelector("*");
        driver.findElement(cssall);
        By ulInDiv = By.cssSelector("div ul");
        By trInTable = By.cssSelector("table tr");
        By trInBody = By.cssSelector("tbody tr");
        driver.findElement(ulInDiv);
        driver.findElement(trInTable);
        driver.findElement(trInBody);
        By firstChildUlInDiv = By.cssSelector("div > ul");
        By firstChildTrInBody = By.cssSelector("tbody > td");
        driver.findElement(firstChildUlInDiv);
        driver.findElement(firstChildTrInBody);
        By firstFormAfterLabel = By.cssSelector("label + form");
        By allfirstFormAfterLabel = By.cssSelector("label ~ form");
        //css3
        By attrTag = By.cssSelector("input[name='fname']");
        By attrContains = By.cssSelector("[name* = 'name']");
        By attrStarts = By.cssSelector("[name^='f']");
        By attrEnds = By.cssSelector("[name$= 'name']");
        driver.findElement(attrTag);
        driver.findElement(attrContains);
        driver.findElement(attrStarts);
        driver.findElement(attrEnds);
        //css 4
        By firstChild = By.cssSelector("br:first-child");
        By lastChild = By.cssSelector("br:last-child");
        By thirdChild = By.cssSelector("br:nth-child(3)");

        driver.findElement(firstChild);
        driver.findElement(lastChild);
        driver.findElement(thirdChild);

    }
}
