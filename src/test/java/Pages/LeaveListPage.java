package Pages;

import net.jodah.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LeaveListPage {
    WebDriver driver;
    By leave = By.xpath("(//span[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\"])[3]");
    By leaveTab = By.xpath("(//a[@class='oxd-topbar-body-nav-tab-item'])[3]");
    By status = By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']");
    By employeeName = By.xpath("//input[@placeholder='Type for hints...']");
    By searchButton = By.xpath("//button[@type='submit']");
    By logout = By.xpath("//p[@class='oxd-userdropdown-name']");

    public LeaveListPage(WebDriver driver) {
        this.driver = driver;
    }

    public void leave() {

        driver.findElement(leave).click();
        driver.findElement(leaveTab).click();
        driver.findElement(status).click();
        driver.findElement(By.xpath("//*[contains(text(),'Pending Approval')]")).click();
        driver.findElement(employeeName).sendKeys("Odis");
        driver.findElement(By.xpath("//*[contains(text(),'Odis')]")).click();
        driver.findElement(searchButton).click();
        driver.findElement(logout).click();
        driver.findElement(By.xpath("//*[contains(text(),'Logout')]")).click();
    }
}

