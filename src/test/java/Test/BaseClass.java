package Test;

import Pages.PageFactory;
import net.jodah.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;


public class BaseClass {
    static WebDriver driver;
    protected static PageFactory pagefactory;
    @BeforeClass
    public static void setup(){
        driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        pagefactory = new PageFactory(driver);
    }

    @AfterClass
    public static void close() throws InterruptedException
    { Thread.sleep(2000);
        driver.close();
        driver.quit();
    }

}
