package basepage;

import core.Driver;
import org.openqa.selenium.WebDriver;

public abstract class BasePage {
    protected WebDriver driver;
    protected final String URL = "https://opensource-demo.orangehrmlive.com/";

    public BasePage() {
        this.driver = Driver.getDriver();
    }

}
