package Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class LoginTest extends BaseClass {
    @Test(priority = 1)
    public void login() throws InterruptedException {
        pagefactory.getLoginPage().login();
        verification("//h6", "PIM");
    }

}
