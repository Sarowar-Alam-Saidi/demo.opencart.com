package LICT.Sarowar_Lict_Automation_Project;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestPage_AutoP {
	
	WebDriver driver;
	
	@BeforeTest
	public void beforeTest() {
		WebDriverManager.chromedriver().setup();
		System.out.println("Launch Chrome Browser");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Maximising Browser");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Setting Time");
		driver.get("http://automationpractice.com/");
		System.out.println("Opening Website");
	}
	
	@Test (priority =  0)
	public void checking_LogIn_is_working() {
		
		HomePage_LogIn_Page homepage = new HomePage_LogIn_Page(driver);
		homepage.click_signIn_before();
		homepage.Enter_email("email@email.com");
		homepage.Enter_password("Pass12");
		homepage.click_signIn_after();
		homepage.verify_logged_in_properly();
		
		assertEquals(homepage.verify_logged_in_properly(),"MY ACCOUNT");
		
		homepage.Click_Log_out();
	}
	
	@Test (priority =  1)
	public void checking_LogIn_invalidEmail_is_not_working() {
		
		HomePage_LogIn_Page homepage = new HomePage_LogIn_Page(driver);
		homepage.click_signIn_before();
		homepage.Enter_email("bmail@gmail.com");
		homepage.Enter_password("Pass12");
		homepage.click_signIn_after();
		homepage.verify_logged_in_not_working_properly();
		
		assertEquals(homepage.verify_logged_in_not_working_properly(),"Authentication failed.");
	}
	
	@Test (priority =  2)
	public void checking_LogIn_invalidPass_is_not_working() {
		
		HomePage_LogIn_Page homepage = new HomePage_LogIn_Page(driver);
		homepage.click_signIn_before();
		homepage.Enter_email("email@email.com");
		homepage.Enter_password("Pass1");
		homepage.click_signIn_after();
		homepage.verify_logged_in_not_working_properly();
		
		assertEquals(homepage.verify_logged_in_not_working_properly(),"Authentication failed.");
	}
	
	@Test (priority =  3)
	public void checking_LogIn_is_working_for_add_to_cart() {
		
		HomePage_LogIn_Page homepage = new HomePage_LogIn_Page(driver);
		//homepage.click_signIn_before();
		homepage.Enter_email("email@email.com");
		homepage.Enter_password("Pass12");
		homepage.click_signIn_after();
		//homepage.verify_logged_in_properly();
		
		//assertEquals(homepage.verify_logged_in_properly(),"MY ACCOUNT");
	}
	
	
	@AfterTest
	public void afterTest() {
		driver.close();
		driver.quit();
	}
	
	
	

}
