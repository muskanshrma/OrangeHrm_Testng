package Pages;

import org.openqa.selenium.WebDriver;


public class PageFactory {
    WebDriver driver;
    private LoginPage loginPage;
    private AdminPage adminPage;
    private AddUserDetailsPage addUser;
    private LeaveListPage leaveList;
    private ApplyLeavePage applyleave;

    public PageFactory(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage getLoginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage(driver);
        }
        return loginPage;
    }

    public AdminPage getAdmin() {
        if (adminPage == null) {
            adminPage = new AdminPage(driver);
        }
        return adminPage;
    }

    public AddUserDetailsPage getAddUserDetailsPage() {
        if (addUser == null) {
            addUser = new AddUserDetailsPage(driver);
        }
        return addUser;
    }

    public ApplyLeavePage getApplyLeavePage() {
        if (applyleave == null) {
            applyleave = new ApplyLeavePage(driver);
        }
        return applyleave;
    }

    public LeaveListPage getLeaveListPage() {
        if (leaveList == null) {
            leaveList = new LeaveListPage(driver);
        }
        return leaveList;
    }

}

