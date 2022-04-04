package SwagLabs_test.BasicActionSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExecutorTest {

    public void executeJavaScript(){
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("Nezwa witryny");
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        WebElement basicPageLink = driver.findElement(By.linkText("Podstawowa strona tesotwa"));
        executor.executeScript("arguments[0].click();", basicPageLink); // uzycie javascript na elemencie na ktołrycm zwykła metoda click nie działa
        // java script wprowadzenie wartosci
        WebElement firstName = driver.findElement(By.name("fname")); //lokalizowanie elementu
        executor.executeScript("arguments[0].setAttribute('value', 'bartek' ", firstName); // do elementu vartosci przez JS

    }
}
