package base.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.openqa.selenium.support.How.ID;

public class TestPage extends BasePage{

    private WebDriver driver;

    @FindBy(how=ID, using="userName")
    private WebElement userName;

    @FindBy(how=ID, using="userEmail")
    private WebElement email;

    public TestPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    public TestPage setUserName(String text){
        fluentWaitVisibilityOf(userName,30,driver);
        userName.sendKeys(text);
        return this;
    }

    public WebElement getUserName(){
        return userName;
    }

    public String getUserNameText(String text){
        waitForElementWithTextValue(userName, text, driver);
        return userName.getAttribute("value");
    }

    public TestPage setEmail(String text){
        email.sendKeys(text);
        return this;
    }
}

// TODO: CI/CD integrate
// TODO: remove hardcoded webdriver type (chrome)
// TODO: Add loggers and report