package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
WebDriver driver;

    By username = By.xpath("//input[@name='username']");
    By password = By.xpath("//input[@name='password']");
    By submit = By.xpath("//button[@type='submit']");


    public Login(WebDriver driver) {
        this.driver = driver;
    }

    public void login() throws InterruptedException {
        driver.manage().window().maximize();
        Thread.sleep(3000);

        driver.findElement(username).sendKeys("Admin");
        driver.findElement(password).sendKeys("admin123");
        driver.findElement(submit).click();
    }

}
