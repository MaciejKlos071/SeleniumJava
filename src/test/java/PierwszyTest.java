import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class PierwszyTest {
    public static void main(String[] args) {
        WebDriver driver = HomeWork.getBrowser("chrome");
        driver.manage().window().maximize();
        driver.get(urlAddress.googleHome);
        // przejscie do okienka z plikami cookies
        driver.switchTo().frame(0);
        //znalezenie przycisku
        WebElement agreeButton = driver.findElement(By.xpath("//span[contains(text(), 'zgadzam')]"));
        //kliknięcie przycisku
        agreeButton.click();
        // powrót do pierwotnego okna
        driver.switchTo().defaultContent();
        // znajdz pole wyszukiwania
        WebElement searchField = driver.findElement(By.name("q"));
        // wprowadzenie wartości do wyszukiwarki
        searchField.sendKeys("Selenium");
        searchField.sendKeys(Keys.ENTER);
        // znajdź rezultat
        WebElement result = driver.findElement(By.xpath("//a[contains(@href,'selenium.dev')]//span"));
        Assert.assertTrue(result.isDisplayed());

    }
}
