package stepDefinations;

import GreenKart.BaseTest;
import io.cucumber.java.After;
import org.openqa.selenium.WebDriver;

public class Hooks extends BaseTest {

    @After("@Selenium")
    public void tearDown()
    {
        driver.quit();
    }
}
