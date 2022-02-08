import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class SearchPages {
    private WebDriver driver;
    By getStartedLocator = By.className("mw-200");
    By formRegistratedLocator = By.name("Schedule a Demo");

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\ChromeDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.drata.com");

    }

    @Test
    public void getStarted() throws InterruptedException {
        driver.findElement(getStartedLocator).click();
        Thread.sleep(2000);
        assertEquals("Drata - Request a Demo Today", driver.getTitle());
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
