package Pages;

import net.jodah.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ApplyLeavePage {
    WebDriver driver;
    By leaveTab = By.xpath("(//span[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\"])[3]");

    By applyTab = By.xpath("//a[@class='oxd-topbar-body-nav-tab-item']");
    By leaveType = By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']");
    By fromDate = By.xpath("//i[@class='oxd-icon bi-calendar oxd-date-input-icon']");
    By applyButton = By.xpath("//button[@type='submit']");
    By logoutUser = By.xpath( "//p[@class='oxd-userdropdown-name']");

    public ApplyLeavePage(WebDriver driver) {
        this.driver = driver;
    }

    public void applyLeave() throws InterruptedException {
        driver.findElement(leaveTab).click();
        driver.findElement(applyTab).click();

        driver.findElement(leaveType).click();
        driver.findElement(By.xpath("//*[contains(text(),'CAN')]")).click();
        Thread.sleep(3000);
        driver.findElement(fromDate).click();
        driver.findElement(By.xpath("//*[contains(text(),'Today')]")).click();
        Thread.sleep(3000);
        driver.findElement(applyButton).click();
        driver.findElement(logoutUser).click();
        driver.findElement(By.xpath("//*[contains(text(),'Logout')]")).click();

        String actual = driver.findElement(By.xpath("//span[@class=\"oxd-text oxd-text--span\"]")).getText();

        Assert.isTrue(actual.equals("Success"),"No search Results");
    }
}
