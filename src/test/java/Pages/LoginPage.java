package Pages;

import net.jodah.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage {
WebDriver driver;

    By username = By.xpath("//input[@name='username']");
    By password = By.xpath("//input[@name='password']");
    By submit = By.xpath("//button[@type='submit']");


    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void login() throws InterruptedException {
        driver.manage().window().maximize();
        Thread.sleep(3000);

        driver.findElement(username).sendKeys("Admin");
        driver.findElement(password).sendKeys("admin123");
        driver.findElement(submit).click();

        String actual = driver.findElement(By.xpath("//h6")).getText();
        Assert.isTrue(actual.equals("PIM"),"LoginError");
    }

}
