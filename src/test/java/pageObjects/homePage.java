package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homePage {

    public WebDriver driver;

    public homePage(WebDriver driver) {
        this.driver = driver;
    }

    By search = By.xpath("//*[@type='search']");

    public WebElement getSearch() {
        return driver.findElement(search);
    }

    By vegName = By.xpath("//h4[@class='product-name']");

    public WebElement verifyVegName() {
        return driver.findElement(vegName);
    }

    By increment = By.xpath("//a[@class='increment']");

    public WebElement incrementVeg() {
        return driver.findElement(increment);
    }

    By addToCart = By.xpath("//button[@type='button' and contains(text(),'ADD TO CART')]");

    public WebElement addingToCart() {
        return driver.findElement(addToCart);
    }

}
