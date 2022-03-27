import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class SeleniumTest {
    @Test
    public void openGooglePageByChrome(){
        System.setProperty("webdriver.chrome.driver", "F:\\Drivers\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
    }

    @Test
    public void openGooglePageByFireFox(){
        System.setProperty("webdriver.gecko.driver", "F:\\Drivers\\GeckoDriver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com/");
    }
    @Test
    public void openGooglePageByInernetExplorer(){
        System.setProperty("webdriver.ie.driver", "F:\\Drivers\\IEDriver\\IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();
        driver.get("https://www.google.com/");
    }
}
