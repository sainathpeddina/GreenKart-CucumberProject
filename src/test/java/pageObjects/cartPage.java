package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class cartPage {

    public WebDriver driver ;

    public cartPage(WebDriver driver)
    {
        this.driver = driver;
    }

    By cart = By.xpath("//img[@alt='Cart']");
    public WebElement cartButton()
    {
       return driver.findElement(cart);
    }

    By proceedToCheckOut = By.xpath("//button[@type='button' and  contains(text(),'PROCEED TO CHECKOUT')]");
    public WebElement proceedToCheckOutButton()
    {
       return driver.findElement(proceedToCheckOut);
    }
}
