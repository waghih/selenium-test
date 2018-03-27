package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(name="login")
    WebElement username;
    @FindBy(name="password")
    WebElement password;
    @FindBy(name="commit")
    WebElement button;

    public LoginPage(WebDriver driver) {
      //initialize elements
    	PageFactory.initElements(driver, this);
    }
    
    public void login(String username, String password) {
    	set_username(username);
    	set_password(password);
    	click_button();
    }
     
    private void set_username(String user_name) {
    	username.clear();
    	username.sendKeys(user_name);
    }
     
    private void set_password(String user_password) {
    	password.clear();
    	password.sendKeys(user_password);
    }
     
    private void click_button() {
    	button.click();
    }
}
