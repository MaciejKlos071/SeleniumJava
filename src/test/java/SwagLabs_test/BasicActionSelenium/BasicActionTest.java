package SwagLabs_test.BasicActionSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class BasicActionTest {
    @Test
    public void performAction(){
        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions option = new FirefoxOptions();
        option.setHeadless(true);
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.saucedemo.com/");
        List<String> logins = new ArrayList<>();
        String login = "standard_user";
        String password ="secret_sauce" ;
        WebElement userLogin = driver.findElement(By.cssSelector(".login_credentials"));
        WebElement userPassword = driver.findElement(By.cssSelector(".login_password"));
        WebElement loginInput = driver.findElement(By.cssSelector("#user-name"));
        WebElement passwordInput = driver.findElement(By.cssSelector("#password"));
        WebElement loginButton = driver.findElement(By.cssSelector("input[name='login-button']"));

        loginInput.sendKeys(login);
        passwordInput.sendKeys(password);
        loginButton.sendKeys(Keys.ENTER);
        System.out.println(driver.getTitle());
        Assert.assertTrue(driver.getTitle().equals("Swag Labs"));
        WebElement selector = driver.findElement(By.xpath("//select"));
        Select productSortSelect = new Select(selector);
//        productSortSelect.selectByIndex(2);
//        productSortSelect.selectByValue("za");
        productSortSelect.selectByVisibleText("Name (A to Z)");
        List<WebElement> options = productSortSelect.getOptions();

        SelectCheck SelectCheck = new SelectCheck();
        System.out.println(SelectCheck.checkOption("Name (A to Z)",selector));

        // aby dostać się do zawartości elementu hidden należy użyć .getAttribute("textContent")
        //_______________________________________________________________________________________
        /* Rodzaje alertów na stronie
        */
        Alert firstAlert = driver.switchTo().alert();
        firstAlert.accept();
        driver.switchTo().alert().accept();
        // klikanie prawym przyciskiem myszy
        Actions actions = new Actions(driver) ;
        actions.contextClick(selector).click();
    }
}
