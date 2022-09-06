package Pages;
import org.openqa.selenium.WebDriver;


public class PageFactory {
   WebDriver driver;
    private Login login;
    private Admin admin;
    private AddUser addUser;
    private User user;



  public PageFactory(WebDriver driver){
       this.driver=driver;

  }
public Login getLoginPage() {
    if(login==null){
        login = new Login(driver);
    }
    return  login;
}
    public Admin getAdmin(){
        if(admin==null) {
            admin = new Admin(driver);
        }
        return admin;
    }
    public User getUser(){
        if(user==null) {
            user = new User(driver);
        }
        return user;
    }

    public AddUser getAddUser(){
        if(addUser==null) {
            addUser = new AddUser(driver);
        }
        return addUser;
    }

    }

