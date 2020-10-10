package LICT.Sarowar_Lict_Automation_Project;

import static org.junit.Assert.assertEquals;


import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestPage_Subscribe_NewsLetter {
	
	Random r = new Random();
	
	int email = r.nextInt();
	WebDriver driver;
	@BeforeTest
	public void beforeTest() {
		WebDriverManager.chromedriver().setup();
		System.out.println("Launch Chrome Browser");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Maximising Browser");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Setting Time");
		driver.get("http://automationpractice.com/");
		System.out.println("Opening Website");
	}
	
	@Test (priority =  0)
	public void checking_NewsLetter_subscription_is_working() {
		
		Homepage_Subscribe_NewsLetter homepage = new Homepage_Subscribe_NewsLetter(driver);
		homepage.Enter_email_to_subscribe("user"+email+"@email.com");
		homepage.Click_to_submit();
		homepage.Verify_subscription();
		
		assertEquals(homepage.Verify_subscription(),"Newsletter : You have successfully subscribed to this newsletter.");
	}
	
	@Test (priority =  1)
	public void checking_NewsLetter_subscription_is_not_working_mail_already_exist() {
		
		Homepage_Subscribe_NewsLetter homepage = new Homepage_Subscribe_NewsLetter(driver);
		homepage.Enter_email_to_subscribe("email@email.com");
		homepage.Click_to_submit();
		homepage.Already_subscription();
		
		assertEquals(homepage.Already_subscription(),"Newsletter : This email address is already registered.");
	}
	
	@AfterTest
	public void afterTest() {
		driver.close();
		driver.quit();
	}


}
