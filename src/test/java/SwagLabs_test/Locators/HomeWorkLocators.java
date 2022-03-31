package SwagLabs_test.Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class HomeWorkLocators {

    @Test
    public void HomeWorkSelectors() {
        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions options = new FirefoxOptions();
        options.setHeadless(true);
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.saucedemo.com/");

        WebElement userLogin = driver.findElement(By.cssSelector(".login_credentials"));
        WebElement userPassword = driver.findElement(By.cssSelector(".login_password"));
        WebElement loginInput = driver.findElement(By.cssSelector("#user-name"));
        WebElement passwordInput = driver.findElement(By.cssSelector("#password"));
        WebElement loginButton = driver.findElement(By.cssSelector("input[name='login-button']"));
        List<String> logins = new ArrayList<>();
        String password = new String();

        System.out.println("_________________________________________");

        logins.addAll(List.of(userLogin.getText().strip().split("\n")));
        logins.remove(0);
        password = userPassword.getText().strip().split("\n")[1];
        loginInput.sendKeys(logins.get(0));
        passwordInput.sendKeys(password);
        loginButton.click();
        System.out.println(driver.getTitle());
        Assert.assertTrue(driver.getTitle().equals("Swag Labs"));
    }
}
