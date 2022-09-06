package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class User {
    WebDriver driver;
    By User =By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']");

    public User(WebDriver driver) {
        this.driver = driver;
    }
    public void user() throws InterruptedException {
        driver.manage().window().maximize();
        Thread.sleep(3000);

        driver.findElement(User).click();
        Thread.sleep(5000);
    }
}
