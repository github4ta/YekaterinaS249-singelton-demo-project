package ui;

import basepage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage  extends BasePage {

    public final String USERNAME_INPUT = "//input[@name='username']";
    public final String PASSWORD_INPUT = "//input[@name='password']";
    public final String LOGIN_BUTTON = "//button[@type='submit']";
    public final String ERROR_MESSAGE = "//span[text()='Required']";

    public HomePage() {
        super();
    }

    public void open() {
        driver.get(URL);
    }

    public void setInputEmail(String email) {
       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
       WebElement inputEmail = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(USERNAME_INPUT)));
       inputEmail.sendKeys(email);
    }

    public void setInputPassword(String password) {
        driver.findElement(By.xpath(PASSWORD_INPUT)).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(By.xpath(LOGIN_BUTTON)).click();
    }

    public String getErrorMessage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement error = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ERROR_MESSAGE)));
        return error.getText();
    }
}
