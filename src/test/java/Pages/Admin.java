package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Admin {
    WebDriver driver;

    By admin = By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name']");
    By AddUser =By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']");


    public Admin(WebDriver driver) {
        this.driver = driver;
    }
    public void admin() throws InterruptedException {
        driver.manage().window().maximize();
        Thread.sleep(3000);

        driver.findElement(admin).click();
        driver.findElement(AddUser).click();
}
}