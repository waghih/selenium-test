package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordPage {

	@FindBy(name="email")
    WebElement email;
    @FindBy(name="commit")
    WebElement button;

    public ForgotPasswordPage(WebDriver driver) {
      //initialize elements
    	PageFactory.initElements(driver, this);
    }
    
    public void recoverPassword(String user_email) {
    	set_email(user_email);
    	click_button();
    }
     
    private void set_email(String user_email) {
    	email.clear();
    	email.sendKeys(user_email);
    }
     
    private void click_button() {
    	button.click();
    }
}
