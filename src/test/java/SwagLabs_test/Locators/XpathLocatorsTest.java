package SwagLabs_test.Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

import java.util.LinkedList;
import java.util.List;

public class XpathLocatorsTest {
        @Test
        public void FindElements(){
                WebDriverManager.firefoxdriver().setup();
                FirefoxOptions options = new FirefoxOptions();
                options.setHeadless(true);

                WebDriver driver = new FirefoxDriver();
                driver.get("https://www.saucedemo.com/");

                By xpathByIdLoginName = By.xpath("/html/body/button[@id ='clickOnMe']");
                driver.findElement(xpathByIdLoginName);

                By xpathByClass = By.xpath("//p[@class='topsecret']");
                driver.findElement(xpathByClass);

                By xpathByTag = By.xpath("//input");
                driver.findElement(xpathByTag).sendKeys("wartosc");

                By xpathName = By.xpath("//input[@name='password']");
                driver.findElement(xpathName).sendKeys("password");


                By xpathLinkText = By.xpath("//a[text()='Visit W3Schools.com!']");

                By xpathPartialLinkText = By.xpath("//a[contains(text(),'Visit')");

                By fullXpath = By.xpath("/html/body/div/ul");
                By shoprtPath = By.xpath("//ul");
                By allXpath = By.xpath("//*");
                By scoundElement = By.xpath("(//input)[2]");
                By lastElement = By.xpath("(//input)[last()]");
                By elementWithAttribute = By.xpath("//*[@name]");
                By attrEq = By.xpath("//button[@id='clickOnMe']");
                By attrNotEq = By.xpath("//*[@id!='clickOnMe']");
                By attrCont = By.xpath("//*[contains(@name,'ame')]");
                By startsWith = By.xpath("//*[starts-with(@name,'ame')");
                By endsWith = By.xpath("//*[ends-with(@name,'ame')");
                //6
                By child = By.xpath("//div/child::ul");
                By desc = By.xpath("//div/descendant::ul");
                By parent = By.xpath("//div/../..");
                By asc = By.xpath("//div/ascestor::*");
                By foll = By.xpath("//img/following::*");
                By follSibling = By.xpath("//img/following-sibling::*");
                By prec = By.xpath("//img/preceding::*");
                By precSibling = By.xpath("//img/preceding-sibling::*");
                //7
                By divsAndLinks = By.xpath("//a | //div");
                By andOp = By.xpath("//input[@name='fname' and @id='fname']");
                By orOP = By.xpath("//input[@name='fname or @id='fnam'");



                By xpathClass2 = By.xpath("[class = 'bot_column']");
                driver.findElement(xpathClass2);

//        driver.close();
                By cssall = By.xpath("*");
                driver.findElement(cssall);
                By ulInDiv = By.xpath("div ul");
                By trInTable = By.xpath("table tr");
                By trInBody = By.xpath("tbody tr");
                driver.findElement(ulInDiv);
                driver.findElement(trInTable);
                driver.findElement(trInBody);
                By firstChildUlInDiv = By.xpath("div > ul");
                By firstChildTrInBody = By.xpath("tbody > td");
                driver.findElement(firstChildUlInDiv);
                driver.findElement(firstChildTrInBody);
                By firstFormAfterLabel = By.xpath("label + form");
                By allfirstFormAfterLabel = By.xpath("label ~ form");
                //css3
                By attrTag = By.xpath("input[name='fname']");
                By attrContains = By.xpath("[name* = 'name']");
                By attrStarts = By.xpath("[name^='f']");
                By attrEnds = By.xpath("[name$= 'name']");
                driver.findElement(attrTag);
                driver.findElement(attrContains);
                driver.findElement(attrStarts);
                driver.findElement(attrEnds);
                //css 4
                By firstChild = By.xpath("br:first-child");
                By lastChild = By.xpath("br:last-child");
                By thirdChild = By.xpath("br:nth-child(3)");

                driver.findElement(firstChild);
                driver.findElement(lastChild);
                driver.findElement(thirdChild);

                By fullPath = By.xpath("/html/body/div/ul");
                driver.findElement(fullPath);
                By shortPath = By.xpath("//ul");
                driver.findElement(shortPath);
        }
        }
