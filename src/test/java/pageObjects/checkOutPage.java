package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class checkOutPage {

    public WebDriver driver ;

    public checkOutPage(WebDriver driver)
    {
        this.driver = driver;
    }

    By productName = By.xpath("//p[@class='product-name']");
    public WebElement productNameInCheckOut()
    {
        return driver.findElement(productName);
    }

}
