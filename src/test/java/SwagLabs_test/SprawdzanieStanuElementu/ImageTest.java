package SwagLabs_test.SprawdzanieStanuElementu;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ImageTest {

    WebDriver driver;
    @Test
    public void imageLoadedTest() {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        WebElement image = driver.findElement(By.id("smileImage"));
        System.out.println(image.getAttribute("naturalHeight"));
        String height = image.getAttribute("naturalHeight");
        Assert.assertEquals(height, "0");
    }

}
