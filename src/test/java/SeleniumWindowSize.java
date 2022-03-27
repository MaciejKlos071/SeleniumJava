import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;


public class SeleniumWindowSize {
    public static void main(String[] args) {
        WebDriver driver = HomeWork.getBrowser("chrome");
        driver.manage().window().maximize();
        Dimension windowSieze = new Dimension(200,200);
        driver.manage().window().setSize(windowSieze);
        driver.get(urlAddress.googleHome);
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("window.open('https://www.google.com/','blank', 'height=400, width=400')");
        driver.close();
    }
}