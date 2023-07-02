package base.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class TestPage {

    private WebDriver driver;

    public TestPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }


}
