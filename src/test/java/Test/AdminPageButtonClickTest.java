package Test;

import org.testng.annotations.Test;

import static Test.BaseClass.pageFactory;

public class AdminPageButtonClickTest extends BaseClass {

    @Test(priority = 1)
    public void login() throws InterruptedException {
        pageFactory.getLoginPage().login();
    }

    @Test(priority = 2)
    public void admin() throws InterruptedException {
        pageFactory.getAdmin().admin();
    }
}

