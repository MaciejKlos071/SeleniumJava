package SwagLabs_test.BasicActionSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsTest {
    @Test
    public void actionTest(){
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("Nazwa witryny");
        WebElement elementNaStronie = driver.findElement(By.cssSelector("#user-name"));
        // klikanie prawym przyciskiem myszy
        Actions actions = new Actions(driver) ;
        actions.contextClick(elementNaStronie).click();
        // podwójne kliknięcie
        actions.doubleClick(elementNaStronie).perform();
        // najechanie na element
        actions.moveToElement(elementNaStronie).perform();

    }
}
