package base.utils;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class BaseTest {

//    public WebDriver driver;
//
//    @BeforeSuite
//    public void launchBrowser() {
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        driver.manage().timeouts();
//        driver.manage().window().maximize();
//    }
//
//    @AfterClass
//    public void closeClass(){
//        System.out.println("Closed");
//    }


    DriverManager driverManager;
    public WebDriver driver;


    @BeforeTest
    public void beforeTest() {
        driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
        driver = driverManager.getDriver();

    }
}

