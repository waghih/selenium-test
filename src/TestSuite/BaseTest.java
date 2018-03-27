package TestSuite;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	public WebDriver driver;
	
	@BeforeTest
	public void open() {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://github.com/login");
	}
	
	@AfterTest
	public void close() {
	    driver.close();
	}
}
