package LICT.Sarowar_Lict_Automation_Project;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestPage_Search_verify {
	String email = "user"+RandomStringUtils.randomNumeric(4)+"@email.com";
	String firstNameReg = RandomStringUtils.randomAlphabetic(4);
	String lastNameReg = RandomStringUtils.randomAlphabetic(4);;
	String password = RandomStringUtils.randomAlphanumeric(8);
	String firstNameAdd = RandomStringUtils.randomAlphabetic(8);
	String lastNameAdd = RandomStringUtils.randomAlphabetic(8);
	String address = RandomStringUtils.randomAlphabetic(8);
	String city = RandomStringUtils.randomAlphabetic(8);
	String postcode = RandomStringUtils.randomNumeric(5);
	String additional = RandomStringUtils.randomAlphabetic(20);
	String mobile ="+880"+ RandomStringUtils.randomNumeric(10);
	
	WebDriver driver;
	TestPage_AutoP log = new TestPage_AutoP();
	TestPage_Reg reg = new TestPage_Reg();
	
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
	public void checking_Search_is_working() {
		
		HomePage_Search_verify homepage = new HomePage_Search_verify(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		homepage.input_search_keyword("T Shirt");
		homepage.input_search_submit();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		homepage.Select_tshirt();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		homepage.Select_color();
		homepage.Add_to_cart();
		homepage.Proceed_to_checkout();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		homepage.confirm_Proceed_to_checkout();
		//homepage.confirm_user();
		
		if(homepage.confirm_user().contentEquals("AUTHENTICATION")){
			homepage.Enter_email("email@email.com");
			homepage.Enter_password("Pass12");
			homepage.click_signIn_after();
			System.out.println("Logged In into the system");
		}
		else if(homepage.Log_error().contentEquals("There is 1 error")) {
			homepage.Enter_mail_to_Reg(email);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			homepage.Click_create_Accout();
			homepage.Check_gender_button_to_Reg();
			homepage.Enter_first_name_for_reg(firstNameReg);
			homepage.Enter_Last_name_for_reg(lastNameReg);
			homepage.Enter_Password_reg(password);
			homepage.Select_birth_day();
			homepage.Select_birth_month();
			homepage.Select_birth_year();
			homepage.Enter_first_name_for_address(firstNameAdd);
			homepage.Enter_last_name_for_address(lastNameAdd);
			homepage.Enter_address(address);
			homepage.Enter_city(city);
			homepage.Select_dropdown_state();
			homepage.Enter_post_code(postcode);
			homepage.Enter_additional_info(additional);
			homepage.Enter_mobile_no("+880"+mobile);
			homepage.Click_register_Button();

			System.out.println("Registered As new User");
		}
		else {
			System.out.println("Something has gone wrong!");
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		homepage.Before_Final_proceed();
		homepage.Check_condition();
		homepage.Final_proceed();
		homepage.Pay_method();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		homepage.Confirm_pay();
		
		assertEquals(homepage.Verify_purchase(),"Your order on My Store is complete.");
		
		homepage.Click_Log_out();
	}
	@AfterTest
	public void afterTest() {
		driver.close();
		driver.quit();
	}
	
}
