package Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseClass {
    @Test(priority = 1)
    public void login() throws InterruptedException {
        pageFactory.getLoginPage().login();
    }
}
