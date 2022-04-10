package testowankoNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Ignore;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
//import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
//
public class SecoundTest extends BaseTest{

    WebDriver driver;

    @Test
    public void firstTest(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/wait2.html");
        driver.findElement(By.id("clickOnMe")).click();

        waitForElementToExist(By.cssSelector("p"));
        String tekst = driver.findElement(By.cssSelector("p")).getText();
        Assert.assertEquals(tekst, "Dopiero się pojawiłem!");
        driver.quit();

    }
    @Test @Ignore
    public void secondTest(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/wait2.html");
        driver.findElement(By.id("clickOnMe")).click();

        waitForElementToExist(By.cssSelector("p"));
        String tekst = driver.findElement(By.cssSelector("p")).getText();
        Assert.assertEquals(tekst, "Dopiero się pojawiłem!");
        driver.quit();

    }


    public void waitForElementToExist(By locator){
        FluentWait<WebDriver> wait = new FluentWait<>(driver);
        wait.ignoring(NoSuchElementException.class);
        wait.withTimeout(Duration.ofSeconds(10));
        wait.pollingEvery(Duration.ofSeconds(2));

        wait.until((driver) -> {
            List<WebElement> elements = driver.findElements(locator);
            if(elements.size()>0){
                System.out.println("element jest na stronie");
                return true;
            }else {
                System.out.println("brak elementu na stronie");
                return false;
            }
        });

    }
}
