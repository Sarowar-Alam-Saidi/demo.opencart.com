package LICT.Sarowar_Lict_Automation_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_LogIn_Page {
	
	WebDriver driver;
	
	public HomePage_LogIn_Page(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

//	public void Homepage_LogIn_Page(WebDriver driver) {
//		
//		this.driver = driver;
//		PageFactory.initElements(driver, this);
//	}
	
	@FindBy (xpath="//a[@class='login']")
	WebElement LogIn_button;
	
	@FindBy (xpath="//input[@id='email']")
	WebElement input_email;

	@FindBy (xpath="//input[@id='passwd']")
	WebElement input_password;
	
	@FindBy (xpath="//p[@class='submit']//span[1]")
	WebElement click_sign_in_button;
	
	@FindBy (xpath="//h1[@class='page-heading']")
	WebElement verify_login;
	
	@FindBy (xpath ="//li[contains(text(),'Authentication failed.')]")
	WebElement verify_not_login;
	
	@FindBy(xpath="//a[@class='logout']")	
	 public WebElement logout_btn;
	
	public void click_signIn_before() {
		
		LogIn_button.click();
		System.out.println("Clicked on Sign In on Menubar");
	}
	
	public void Enter_email(String keyword) {
		
		input_email.sendKeys(keyword);
		System.out.println("Entered Email Address");
	}

	public void Enter_password(String keyword) {
	
		input_password.sendKeys(keyword);
	System.out.println("Entered Password");
	}

	public void click_signIn_after() {
	
		click_sign_in_button.click();
	System.out.println("Clicked on Sign In button");
	}
	
	public String verify_logged_in_properly() {
		 return verify_login.getText();
		
	}

	public String verify_logged_in_not_working_properly() {
		// TODO Auto-generated method stub
		return verify_not_login.getText();
	}
	
	 public void Click_Log_out() {
		  logout_btn.click();
		System.out.println("Logged Out");
	  }

		
}


	
	


