package SwagLabs_test.BasicActionSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UploadTest {
    public void uploadFile() {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("Nezwa witryny");
        //aby wysłać plik do strony, trzeba wysłać przez metode sendKeys ścieżkę do pliku
        driver.findElement(By.id("id")).sendKeys("F:\\seleniumjava\\src\\test\\java\\SwagLabs_test\\BasicActionSelenium\\file.txt");
        //upload alternatywne podejście jeżeli uprzedni nie zadziała
        // zrobić można to prze sikuli http://olyv-qa.blogspot.com/2016/11/using-sikulix-to-handle-file-upload.html
        // dodać dependencje do pom
        // _________________________ zrobnie screen shota


    }
}
