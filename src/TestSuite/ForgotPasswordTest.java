package TestSuite;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.ForgotPasswordPage;

public class ForgotPasswordTest extends BaseTest {
	
	ForgotPasswordPage forgotPassword;
	
	@BeforeTest
	public void setup() {
		driver.findElement(By.linkText("Forgot password?")).click();
		forgotPassword = new ForgotPasswordPage(driver);
	}
	
	@Test(priority=1)
	public void verify1() {
	    forgotPassword.recoverPassword("dummy_user@email.com");
	    // expect valid email and exist and redirect to reset password page
	}
	
	@Test(priority=2)
	public void verify2() {
	    forgotPassword.recoverPassword("invalid email");
	    // expect invalid email error message
	}
	
	@Test(priority=3)
	public void verify3() {
	    forgotPassword.recoverPassword("");
	    // expect field required with border color
	}
	
	@Test(priority=4)
	public void verify4() {
	    forgotPassword.recoverPassword("nonexistent_email@email.com");
	    // expect error message email not exist
	}
}
