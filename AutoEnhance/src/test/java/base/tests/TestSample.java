package base.tests;

import base.utils.BaseTest;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class TestSample extends BaseTest {

    @AfterClass
    public void closeClass(){
        driver.quit();
    }

    @Test
    void test() {
        // Exercise
        driver.get("https://bonigarcia.dev/selenium-webdriver-java/");
        String title = driver.getTitle();

        // Verify
        Assert.assertEquals(title,"Hands-On Selenium WebDriver with Java");
    }

}
