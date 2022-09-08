package Test;

import org.testng.annotations.Test;

public class TC01ApplyLeaveTest extends BaseClass{

    @Test(priority = 1)
    public void login() throws InterruptedException {
        pageFactory.getLoginPage().login();
    }
    @Test(priority = 2)
    public void applyLeave() throws InterruptedException {
        pageFactory.getApplyLeavePage().applyLeave();
    }
}

