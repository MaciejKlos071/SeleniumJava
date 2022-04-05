package testowankoNG;

import org.testng.annotations.*;

public class BaseTest {

    @BeforeSuite
    public void beforeSuit(){
        System.out.println("Before Suit");
    }
    @AfterSuite
    private void afterSuit(){
        System.out.println("After suit");
    }

    @BeforeClass
    private void beforeClass(){
        System.out.println("Before Class");
    }

    @AfterClass
    private void afterClass(){
        System.out.println("after Class");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("I am running before test");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("I am running before method");
    }


    @AfterTest
    public void aftertTest(){
        System.out.println("I am running after test");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("I am running after method");
    }
}
