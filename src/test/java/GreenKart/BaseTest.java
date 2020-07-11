package GreenKart;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * Unit test for simple App.
 */
public class BaseTest
{
    public static WebDriver driver;
    public static Properties prop ;
    public static WebDriver getDriver()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\SAINATH\\IdeaProjects\\Automation\\Automation\\src\\test\\java\\Resources\\chromedriver.exe");
        return driver = new ChromeDriver();
    }
    public static Properties getData() throws Exception {
        prop = new Properties();
        FileInputStream file = new FileInputStream("C:\\Users\\SAINATH\\IdeaProjects\\Automation\\Automation\\src\\test\\java\\GreenKart\\global.properties");
        prop.load(file);
        return prop ;
    }
}
