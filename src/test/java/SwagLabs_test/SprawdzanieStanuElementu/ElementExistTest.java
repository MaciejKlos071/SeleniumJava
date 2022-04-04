package SwagLabs_test.SprawdzanieStanuElementu;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ElementExistTest {
    WebDriver driver;
    @Test
    public void elementExistTest(){
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");

        driver.findElement(By.tagName("p"));

        driver.findElement(By.tagName("topsecret"));

        // czy element jest wyswietlony
        driver.findElement(By.tagName("p")).isDisplayed();
        driver.findElement(By.tagName("button")).isDisplayed();
        // czy mozemy wejsc w interakcje z elementem, czy jest niedostępny.
        driver.findElement(By.tagName("button")).isEnabled();
        // czy chceckox jest zaznaczony
        WebElement checkBox = driver.findElement(By.xpath("//input[@value='male']"));
        //czy obrazek na stronie został poprawnie załadowny
        checkBox.isSelected();
    }
    public boolean elementExist(By locator){
        try {
            driver.findElement(locator);
            return true;
        }catch (NoSuchElementException exception){
            return false;
        }

    }
    public boolean elementsExist(By locator){
        return driver.findElements(locator).size() > 0;
    }
}
