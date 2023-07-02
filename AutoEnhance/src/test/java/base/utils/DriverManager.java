package base.utils;

import org.openqa.selenium.WebDriver;

public abstract class DriverManager {

    protected WebDriver driver;

    protected abstract WebDriver createDriver();

    public WebDriver getDriver() {
        if (null == driver) {
            createDriver();
        }
        return driver;
    }

}
