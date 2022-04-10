package testowankoNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
//import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
// ustawienia priorytetu testów
public class ThirdTest extends BaseTest{

    WebDriver driver;

    @Test(priority = 1)
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
    @Test(priority = 2)
    public void secoundTest(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/wait2.html");
        driver.findElement(By.id("clickOnMe")).click();

        waitForElementToExist(By.cssSelector("p"));
        String tekst = driver.findElement(By.cssSelector("p")).getText();
        Assert.assertEquals(tekst, "Dopiero się pojawiłem!");
        driver.quit();

    }

    @Test(priority = 0)
    public void thirdTest(){
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
    @Test(dataProvider = "data")
    public void dpTest(String val, String number){
        System.out.println(val);
        System.out.println(number);
    }
    @DataProvider(name = "data")
    public Object[][] dataProvider(){
        return new Object[][]{{"I'm first", "first"},{"I'm secound","secound"},{"i'm third","third"}};
    }
}
