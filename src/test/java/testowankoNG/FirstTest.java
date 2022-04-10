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
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.List;
//  assercje
public class FirstTest extends BaseTest{

    WebDriver driver;

    @Test @Ignore
    public void firstTest(){

        driver = DriverFactory.getDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/wait2.html");
        driver.findElement(By.id("clickOnMe")).click();

        waitForElementToExist(By.cssSelector("p"));
        WebElement paragraf = driver.findElement(By.cssSelector("p"));
        String tekst = driver.findElement(By.cssSelector("p")).getText();
        //Twarde asercje
        Assert.assertEquals(paragraf.isDisplayed(),true);
        Assert.assertEquals(tekst, "Dopiero się pojawiłem!");
        Assert.assertEquals(tekst,"Dop","teksty się różnią");
        Assert.assertTrue(paragraf.isDisplayed());
        Assert.assertTrue(paragraf.isDisplayed());
        Assert.assertTrue(paragraf.getText().startsWith("Dopiero"));
        Assert.assertTrue(paragraf.getText().endsWith("m!"));

        driver.quit();

    }
    @Test
    public void secoundTest(){
        driver = DriverFactory.getDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/wait2.html");
        driver.findElement(By.id("clickOnMe")).click();

        waitForElementToExist(By.cssSelector("p"));
        WebElement paragraf = driver.findElement(By.cssSelector("p"));
        String tekst = driver.findElement(By.cssSelector("p")).getText();
        SoftAssert softAssert = new SoftAssert();

        softAssert.assertEquals(tekst, "Dopiero się pojawiłem!");
        softAssert.assertEquals(paragraf.isDisplayed(),true);
        softAssert.assertEquals(tekst, "Dopiero się pojawiłem!");
        softAssert.assertEquals(tekst,"Dop","teksty się różnią");
        paragraf.isDisplayed();

        softAssert.assertTrue(paragraf.isDisplayed(), "not displayed");
        softAssert.assertTrue(paragraf.isDisplayed(), "not displayed");
        softAssert.assertTrue(paragraf.getText().startsWith("Dopiero"), "message");
        softAssert.assertTrue(paragraf.getText().endsWith("m!"), "text doesn't end at 'm!'");
        driver.quit();
        softAssert.assertAll();
    }
    @Test
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
}
