package base.tests;

import base.pages.TestPage;
import base.utils.BaseTest;
import base.utils.Constants;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestSample extends BaseTest {

    private TestPage testPage;

    @BeforeClass
    public void beforeClass(){
        testPage = new TestPage(driver);
    }

    @AfterClass
    public void closeClass(){
        driver.quit();
    }

    @Test
    void test() {
        driver.get(Constants.url);

        testPage.setUserName("Test");
        testPage.setEmail("testEmail");

        // Verify
        Assert.assertEquals(testPage.getUserNameText("Test"),"Test");
    }

}
