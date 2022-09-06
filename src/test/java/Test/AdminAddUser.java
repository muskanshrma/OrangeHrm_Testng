package Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class AdminAddUser extends BaseClass {
    @Test(priority = 1)
    public void login() throws InterruptedException {
        pagefactory.getLoginPage().login();
        verification("//h6", "PIM");
    }

    @Test(priority = 2)
    public void admin() throws InterruptedException {
        pagefactory.getAdmin().admin();
        verification("//h6[1]", "Admin");
    }
}

