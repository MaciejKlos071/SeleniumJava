package SwagLabs_test.OczekiwanieNaElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class WaitSelenium {


    WebDriver driver;
    @Test
    public void sleepWaitTest() throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        WebElement button = driver.findElement(By.id("clickOnMe"));
        button.click();
//        Thread.sleep(5000);
        // timeout - implicty wait
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //explicity wait
        //WebDriverWait waitt = new WebDriverWait(driver, 10);
        //waitt.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("p")));
        // explicity wait - fluent wait
        FluentWait<WebDriver> wait = new FluentWait<>(driver);
        wait.ignoring(NoSuchElementException.class);
        wait.withTimeout(Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("p")));
        // Expected conditions
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("p")));
        driver.findElement(By.cssSelector("p"));
    }
}
