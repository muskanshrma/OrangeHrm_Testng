package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddUser {
    WebDriver driver;

    By UserRole = By.xpath("//i[@class=\"oxd-icon bi-caret-down-fill oxd-select-text--arrow\"]");
    By EmpName = By.xpath("//input[@placeholder=\"Type for hints...\"]");
    By Status = By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[2]");
    By Username = By.xpath("(//input[@class=\"oxd-input oxd-input--active\"])[2]");
    By Password = By.xpath("//input[@type=\"password\"]");
    By confirmPassword = By.xpath("(//div/input[@type='password'])[2]");
    By SaveButton = By.xpath("//button[@type=\"submit\"]");

    public AddUser(WebDriver driver) {
        this.driver = driver;
    }
    public void addUser() throws InterruptedException {
        String random = String.valueOf((int) (Math.random()+5 *2));
        String newUsername = "Muskanadmin@" + random;

        driver.findElement(UserRole).click();
        driver.findElement(By.xpath("//*[contains(text(),'Admin')]")).click();
        Thread.sleep(3000);
        driver.findElement(EmpName).sendKeys("Odis");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[contains(text(),'Odis')]")).click();


        driver.findElement(Status).click();
        driver.findElement(By.xpath("//*[contains(text(),'Enabled')]")).click();


        driver.findElement(Username).sendKeys(newUsername);

        driver.findElement(Password).sendKeys("Admin1234@");
        driver.findElement(confirmPassword).sendKeys("Admin1234@");
        driver.findElement(SaveButton).click();

    }

}
