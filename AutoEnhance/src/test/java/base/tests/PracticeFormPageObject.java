package base.tests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PracticeFormPageObject {

        @FindBy(how = How.ID, using = "userName")
        public WebElement userName;

        @FindBy(how = How.ID, using = "currentAddress")
        public WebElement currentAddress;

}
