package TestSuite;

import Pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class LoginTest {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
	WebDriver driver;
	LoginPage loginPage;

	@BeforeTest
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//	    driver.manage().window().maximize();
	    driver.get("https://app.kakitangan.com/login");
	    loginPage = new LoginPage(driver);
	}
	
	@Test(priority=1)
	public void verify2()
	{
	    
	    loginPage.login("dummy_user@email.com", "password");
//	    Assert.assertEquals(driver.findElement(By.xpath("//*[@id='errorMessage']")).getText(),"Wrong username or password!");
	}

}
