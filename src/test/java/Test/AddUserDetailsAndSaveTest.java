package Test;

import org.testng.annotations.Test;

public class AddUserDetailsAndSaveTest extends BaseClass {
    @Test(priority = 1)
    public void login() throws InterruptedException {
        pageFactory.getLoginPage().login();
    }

    @Test(priority = 2)
    public void admin() throws InterruptedException {
        pageFactory.getAdmin().admin();
    }

    @Test(priority = 3)
    public void addUser() throws InterruptedException {
        pageFactory.getAddUserDetailsPage().addUser();
    }

}
