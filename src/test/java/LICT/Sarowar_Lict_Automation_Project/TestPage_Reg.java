package LICT.Sarowar_Lict_Automation_Project;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestPage_Reg {
	
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
	
	@Test (priority = 0)
	public void Reg_is_working_with_valid_data() {
		HomePage_Reg_Page homepage = new HomePage_Reg_Page(driver);
		
		homepage.Click_SignIn_from_menubar();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Because of slow connection loading time was long and couldn't find out WebElements correctly. this timeouts buy some time to load and resolve the issue. 
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
		homepage.Verify_Registration();
		
		assertEquals(homepage.Verify_Registration(),"MY ACCOUNT");
		homepage.Click_Log_out();
		
	}
	
	@Test (priority = 1)
	public void Reg_is_not_working_with_invalid_email() {
		HomePage_Reg_Page homepage = new HomePage_Reg_Page(driver);
		
		homepage.Click_SignIn_from_menubar();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Because of slow connection loading time was long and couldn't find out WebElements correctly. this timeouts buy some time to load and resolve the issue. 
		homepage.Enter_mail_to_Reg("email_email");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		homepage.Click_create_Accout();
		
		homepage.Verify_email();
		
		assertEquals(homepage.Verify_email(),"Invalid email address.");
		
		
		
	}
	
	@Test (priority = 2)
	public void Reg_not_giving_Required_info() {
		HomePage_Reg_Page homepage = new HomePage_Reg_Page(driver);
		
		homepage.Click_SignIn_from_menubar();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Because of slow connection loading time was long and couldn't find out WebElements correctly. this timeouts buy some time to load and resolve the issue. 
		homepage.Enter_mail_to_Reg(email);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		homepage.Click_create_Accout();
		homepage.Click_register_Button();
		homepage.No_Required_info();
		
		assertEquals(homepage.No_Required_info(),"There are 8 errors");
	}
	
	@Test (priority = 3)
	public void Reg_is_not_working_with_minimum_pass() {
		HomePage_Reg_Page homepage = new HomePage_Reg_Page(driver);
		
		homepage.Click_SignIn_from_menubar();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Because of slow connection loading time was long and couldn't find out WebElements correctly. this timeouts buy some time to load and resolve the issue. 
		homepage.Enter_mail_to_Reg(email);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		homepage.Click_create_Accout();
		homepage.Check_gender_button_to_Reg();
		homepage.Enter_first_name_for_reg(firstNameReg);
		homepage.Enter_Last_name_for_reg(lastNameReg);
		homepage.Enter_Password_reg("1122");
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
		homepage.Verify_Registration_invalid_pass();
		
		assertEquals(homepage.Verify_Registration_invalid_pass(),"passwd is invalid.");
		
	}
	
//	// here I tried to import this method to use at search class but I couldn't do that 
//	public void Reg_is_working_for_add_to_cart() {
//		HomePage_Reg_Page homepage = new HomePage_Reg_Page(driver);
//		
//		//homepage.Click_SignIn_from_menubar();
//		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		//Because of slow connection loading time was long and couldn't find out WebElements correctly. this timeouts buy some time to load and resolve the issue. 
//		homepage.Enter_mail_to_Reg(email);
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		homepage.Click_create_Accout();
//		homepage.Check_gender_button_to_Reg();
//		homepage.Enter_first_name_for_reg(firstNameReg);
//		homepage.Enter_Last_name_for_reg(lastNameReg);
//		homepage.Enter_Password_reg(password);
//		homepage.Select_birth_day();
//		homepage.Select_birth_month();
//		homepage.Select_birth_year();
//		homepage.Enter_first_name_for_address(firstNameAdd);
//		homepage.Enter_last_name_for_address(lastNameAdd);
//		homepage.Enter_address(address);
//		homepage.Enter_city(city);
//		homepage.Select_dropdown_state();
//		homepage.Enter_post_code(postcode);
//		homepage.Enter_additional_info(additional);
//		homepage.Enter_mobile_no("+880"+mobile);
//		homepage.Click_register_Button();
//		//homepage.Verify_Registration();
//		
//		//assertEquals(homepage.Verify_Registration(),"MY ACCOUNT");
//		System.out.println("Show if it's working");
//		
//	}
	
	@AfterTest
	public void afterTest() {
		driver.quit();
	}
}
