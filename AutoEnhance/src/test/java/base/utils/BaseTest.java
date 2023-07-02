package base.utils;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class BaseTest {

    DriverManager driverManager;
    public WebDriver driver;

    @BeforeTest
    public void beforeTest() {
        driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
        driver = driverManager.getDriver();
    }
}

