package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AddUserDetailsPage {
    WebDriver driver;
    By UserRole = By.xpath("//i[@class=\"oxd-icon bi-caret-down-fill oxd-select-text--arrow\"]");
    By EmpName = By.xpath("//input[@placeholder=\"Type for hints...\"]");
    By Status = By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[2]");
    By Username = By.xpath("(//input[@class=\"oxd-input oxd-input--active\"])[2]");
    By Password = By.xpath("(//input[@type=\"password\"])[1]");
    By confirmPassword = By.xpath("(//div/input[@type='password'])[2]");
    By SaveButton = By.xpath("//button[@type=\"submit\"]");
    By searchUser = By.xpath("(//input[@class=\"oxd-input oxd-input--active\"])[2]");
    By userRoleDropdown = By.xpath("//i[@class=\"oxd-icon bi-caret-down-fill oxd-select-text--arrow\"]");
    By searchButton = By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space\"]");

    public AddUserDetailsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addUser(){
        String random = String.valueOf((int) (Math.random() + 4 * 2));
        String newUsername = "Muskanadmin@" + random;
        driver.findElement(UserRole).click();
        driver.findElement(By.xpath("//*[contains(text(),'Admin')]")).click();
        driver.findElement(EmpName).sendKeys("Odis");
        driver.findElement(By.xpath("//*[contains(text(),'Odis')]")).click();
        driver.findElement(Status).click();
        driver.findElement(By.xpath("//*[contains(text(),'Enabled')]")).click();
        driver.findElement(Username).sendKeys(newUsername);
        driver.findElement(Password).sendKeys("Admin1234@");
        driver.findElement(confirmPassword).sendKeys("Admin1234@");
        driver.findElement(SaveButton).click();
        driver.findElement(searchUser).sendKeys(newUsername);
        driver.findElement(userRoleDropdown).click();
        driver.findElement(By.xpath("//*[contains(text(),'Admin')]")).click();
        driver.findElement(searchButton).click();
        boolean isAdminDisplayed = driver.findElement(By.xpath(String.format("//div[contains(text(),'%s')]", newUsername))).isDisplayed();
        Assert.assertTrue(isAdminDisplayed, "User is not added");
    }

}

