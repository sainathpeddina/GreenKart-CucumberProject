package stepDefinations;

import GreenKart.BaseTest;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.cartPage;
import pageObjects.checkOutPage;
import pageObjects.homePage;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class stepDefination {

    public static WebDriver driver;

    homePage hp ;
    cartPage cp ;
    checkOutPage cop ;

    @Given("^user on greenkart home page$")
    public void user_on_greenkart_home_page() throws Exception {
        driver = BaseTest.getDriver();
        System.out.println(driver.toString());
        driver.get(BaseTest.getData().getProperty("url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @When("^user search for a (.+)$")
    public void user_search_for_a(String vegetable) throws InterruptedException {
        hp = new homePage(driver);
        hp.getSearch().sendKeys(vegetable);
        Thread.sleep(3000);
    }

    @Then("^verify displaying (.+)$")
    public void verify_displaying(String vegetable) {
        Assert.assertTrue(hp.verifyVegName().getText().contains(vegetable));
    }

    @Then("^Added to cart$")
    public void added_to_cart() throws InterruptedException {
        for (int i = 0; i < 2; i++) {
            hp.incrementVeg().click();
            Thread.sleep(2000);
        }
        Thread.sleep(1000);
        hp.addingToCart().click();
    }

    @Then("^user proceed to checkout page for purchase$")
    public void user_proceed_to_checkout_page_for_purchase() throws InterruptedException {
        cp = new cartPage(driver);
        cp.cartButton().click();
        cp.proceedToCheckOutButton().click();
        Thread.sleep(2000);
    }

    @Then("^verify selected (.+) are displaying in checkout page$")
    public void verify_selected_are_displaying_in_checkout_page(String vegetable) {
        cop = new checkOutPage(driver);
        Assert.assertTrue(cop.productNameInCheckOut().getText().contains(vegetable));
        driver.quit();
    }

}
