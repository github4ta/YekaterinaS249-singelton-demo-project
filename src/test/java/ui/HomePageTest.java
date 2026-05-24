package ui;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class HomePageTest {
    private  HomePage homePage;

    @DisplayName("Chek error message submit empty form login")
    @Test
    public void emptyFormLogin() {
        homePage.setInputEmail("");
        homePage.setInputPassword("");
        homePage.clickLoginButton();
        Assertions.assertEquals("Required", homePage.getErrorMessage());
        Assertions.assertEquals("Required", homePage.getErrorMessage());
    }
}
