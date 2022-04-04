package SwagLabs_test.BasicActionSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GetPageInfoTest {
    @Test
    public void getInfoTest() {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("Nazwa witryny");
        WebElement elementNaStronie = driver.findElement(By.cssSelector("#user-name"));
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
    }
}
