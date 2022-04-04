package SwagLabs_test.BasicActionSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Iframe {
    public void iframeChandle(){
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("Nezwa witryny");
        //przepięcie do iframe
        driver.switchTo().frame(0); // numerujemy od 0
        driver.switchTo().frame("");
        //aby cofnąć się z iframe od pierwotnego okna :
        driver.switchTo().defaultContent();
        // kolejne metody iframe
        // przyjecie web element
        WebElement iframe = driver.findElement(By.cssSelector("[src ='nazwa atrybutu src']"));
        driver.switchTo().frame(iframe );
        driver.switchTo().frame("nazwa atrybutu name lub atrybutu id jako wartość string");

    }
}
