import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class HomeWork {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Podaj nazwę przeglądarki:\n" +
//                "Chrome\n" +
//                "FireFox\n" +
//                "IE");
//        String browser = scanner.nextLine();
//        WebDriver driver = openBrowser(browser);
//         driver.get("https://www.google.pl/search?q=kupa&sxsrf=APq-WBtAd0evvdFa1XalWS8qpxScIcwh7Q%3A1648156063680&source=hp&ei=n908Yv29JueArwTCob2YBg&iflsig=AHkkrS4AAAAAYjzrr4jR9ReWFF6-oBRerZ-nVteFNyla&ved=0ahUKEwi9idTl09_2AhVnwIsKHcJQD2MQ4dUDCAc&uact=5&oq=kupa&gs_lcp=Cgdnd3Mtd2l6EAM6BwgjEOoCECc6BAgjECc6CwgAEIAEELEDEIMBOggIABCABBCxAzoOCC4QgAQQsQMQxwEQowI6EQguEIAEELEDEIMBEMcBEKMCOggIABCxAxCDAToFCAAQgAQ6BQguEIAEUJAUWLodYPseaAJwAHgAgAFliAGrA5IBAzQuMZgBAKABAbABCg&sclient=gws-wiz");
//    }

    static WebDriver openGooglePageByChrome(){
        System.setProperty("webdriver.chrome.driver", "F:\\Drivers\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        return driver;
    }
    static WebDriver openGooglePageByFireFox(){
        System.setProperty("webdriver.gecko.driver", "F:\\Drivers\\GeckoDriver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        return driver;
    }
    static WebDriver openGooglePageByInernetExplorer(){
        System.setProperty("webdriver.ie.driver", "F:\\Drivers\\IEDriver\\IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();
        return driver;
    }
    @Test
    public static WebDriver getBrowser(String browser){
        switch (browser.toLowerCase()){
            case "chrome":
                return openGooglePageByChrome();
            case "firefox":
                return openGooglePageByFireFox();
            case "ie":
                return openGooglePageByInernetExplorer();
            default:
                throw new InvalidArgumentException("Invalid browser name");
        }

    }
}
