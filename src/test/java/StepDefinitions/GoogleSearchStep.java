package StepDefinitions;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class GoogleSearchStep {

    static WebDriver driver;
    @Test
    public void GoogleSearchStep () {



        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://google.com");


    }




}
