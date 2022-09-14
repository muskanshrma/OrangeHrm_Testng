package Test;

import org.testng.annotations.Test;

public class TC09SearchLeaveList extends BaseClass{

    @Test(priority = 1)
    public void login() throws InterruptedException {
        pageFactory.getLoginPage().login();
    }

    @Test(priority = 2)
    public void leave() throws InterruptedException {
        pageFactory.getLeaveListPage().leave();
    }
}



