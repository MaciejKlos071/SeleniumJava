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
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class WaitSelenium {


    public WebDriver driver;
    @Test
    public void sleepWaitTest() throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/wait2.html");
        WebElement button = driver.findElement(By.id("clickOnMe"));
        button.click();
//        Thread.sleep(5000);
        // timeout - implicty wait
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //explicity wait
        //WebDriverWait waitt = new WebDriverWait(driver, 10);
        //waitt.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("p")));
        // explicity wait - fluent wait
//        FluentWait<WebDriver> wait = new FluentWait<>(driver);
//        wait.ignoring(NoSuchElementException.class);
//        wait.withTimeout(Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("p")));
        // Expected conditions
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("p")));
//        driver.findElement(By.cssSelector("p"));

        waitForElementToExist(By.cssSelector("p"), driver);
    }
    public void waitForElementToExist(By locator, WebDriver driver){
        FluentWait<WebDriver> wait = new FluentWait<>(driver);
        wait.ignoring(NoSuchElementException.class);
        wait.withTimeout(Duration.ofSeconds(10));
        wait.pollingEvery(Duration.ofSeconds(1));

        wait.until(driver1 -> {
            List<WebElement> elements = driver.findElements(locator);
                if(elements.size()>0){
                    System.out.println("element jest na stronie");
                    return true;
                }else {
                    System.out.println("elementu niema na stronie");
                    return false;
                }
        } );
//        wait.until(new Function<WebDriver, Boolean>() {
//            @Override
//            public Boolean apply(WebDriver driver) {
//                List<WebElement> elements = driver.findElements(locator);
//                if(elements.size()>0){
//                    System.out.println("element jest na stronie");
//                    return true;
//                }else {
//                    System.out.println("elementu niema na stronie");
//                    return false;
//                }
//            }
//        });
    }

}
