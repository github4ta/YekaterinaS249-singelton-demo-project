package basepagetest;

import core.Driver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import ui.HomePage;

public class BaseTest {
    protected HomePage homePage;

    @BeforeEach
    public void initTestPages() {
        homePage = new HomePage();
        homePage.open();
    }
    @AfterEach
    public void initDriverClose() {
        Driver.quitDriver();
    }
}
