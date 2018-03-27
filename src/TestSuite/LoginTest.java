package TestSuite;

import Pages.LoginPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;


public class LoginTest extends BaseTest {
	
	LoginPage loginPage;

	@BeforeTest
	public void setup() {
	    loginPage = new LoginPage(driver);
	}

	@Test(priority=1)
	public void verify1() {
	    loginPage.login("wrong_email@email.com", "password");
	    // expect error message wrong email or password
	}
	
	@Test(priority=2)
	public void verify2() {
	    loginPage.login("dummy_user@email.com", "wrongpassword");
	    // expect error message wrong email or password
	}
	
	@Test(priority=3)
	public void verify3() {
		loginPage.login("", "password");
		// expect error message field required with border color
	}

	@Test(priority=4)
	public void verify4() {
		loginPage.login("dummy_user@email.com", "");
		// expect error message field required with border color
	}
	
	@Test(priority=5)
	public void verify5() {
		loginPage.login("invalid email", "password");
		// expect error message invalid email
	}
	
	@Test(priority=6)
	public void verify6() {
		loginPage.login("", "");
		// expect error message field required with border color
	}
	
	@Test(priority=7)
	public void verify7() {
		loginPage.login("dummy_user@email.com", "correctpassword");
		// expect content page library page with mandatory section UPCOMING PRODUCT and main menu
	}
}
