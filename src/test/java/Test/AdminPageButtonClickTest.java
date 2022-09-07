package Test;

import org.testng.annotations.Test;

import static Test.BaseClass.pagefactory;

public class AdminPageButtonClickTest extends BaseClass {
    @Test(priority = 1)
    public void login() throws InterruptedException {
        pagefactory.getLoginPage().login();
      //  verification("//h6", "PIM");
    }

    @Test(priority = 2)
    public void admin() throws InterruptedException {
        pagefactory.getAdmin().admin();
      //  verification("//h6[1]", "Admin");
    }
}

