package SwagLabs_test.BasicActionSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Set;

public class NewWindowTest {
    public void testBewWindow(){
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("Nezwa witryny");
        String currentWindow = driver.getWindowHandle();
        driver.findElement(By.id("NazwaID")).click();
        Set<String> windowNames = driver.getWindowHandles();
        for(String window : windowNames){
            if(!window.equals(currentWindow));
            driver.switchTo().window(window);
        }
        driver.findElement(By.name("Nazwa elementu  w nowym oknie")).sendKeys("wartosc wprowadzana do pola");
        // przełączenie do pierwotnego okna
        driver.switchTo().window(currentWindow);
    }
}
