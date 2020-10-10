package LICT.Sarowar_Lict_Automation_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage_Reg_Page {
	
	
	WebDriver driver;
	
	public HomePage_Reg_Page(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath= "//a[@class='login']")
	 public WebElement click_signIn_menu;
	
	@FindBy (xpath="//input[@id='email_create']")
	 public WebElement enter_mail_to_reg;
	
	@FindBy (xpath= "//form[@id='create-account_form']//span[1]")
	 public WebElement click_to_create_acc;
	
	@FindBy(name="id_gender")	
	 public WebElement gender_btn;
	  
	 @FindBy(id="customer_firstname")	
	 public WebElement enter_first_name_for_reg;
	  
	 @FindBy(xpath="//input[@id='customer_lastname']")	
	  public WebElement enter_last_name_for_reg;
	  
	 @FindBy(xpath="//input[@id='passwd']")	
	 public WebElement enter_password_for_reg;
	  
	 @FindBy(xpath="//select[@id='days']")	
	 public WebElement birth_date;
	  
	 @FindBy(xpath="//select[@id='months']")	
	 public WebElement birth_month;
	  
	 @FindBy(xpath="//select[@id='years']")	
	 public WebElement birth_year;
	  
	 @FindBy(xpath="//input[@id='firstname']")	
	 public WebElement enter_first_name_for_address;
	  
	 @FindBy(id="lastname")	
	 public WebElement enter_last_name_for_address;
	  
	 @FindBy(id="address1")	
	 public WebElement enter_address;
	  
	 @FindBy(id="city")	
	 public WebElement enter_city;
	  
	 @FindBy(id="id_state")	
	 public WebElement dropdown_state;
	  
	 @FindBy(id="postcode")	
	 public WebElement post_code;
	  
	 @FindBy(id="other")	
	 public WebElement enter_additional_info;
	  
	 @FindBy(id="phone_mobile")	
	 public WebElement enter_mobile_no;
	  
	 @FindBy(xpath="//span[contains(text(),'Register')]")	
	 public WebElement registerButton;
	  
	 @FindBy (xpath ="//h1[@class='page-heading']")
	 public WebElement verify_Registration;
	  
	 @FindBy(xpath="//a[@class='logout']")	
	 public WebElement logout_btn;
	 
	 @FindBy (xpath = "//li[contains(text(),'Invalid email address.')]")
	 WebElement verify_mail;
	 
	 @FindBy (xpath ="//p[contains(text(),'There are 8 errors')]")
	 WebElement not_giving_required_info;
	 
	 @FindBy (xpath = "//div[@class='columns-container']//li[1]")
	 WebElement invalid_pass;
	

	public void Click_SignIn_from_menubar() {
		// TODO Auto-generated method stub
		click_signIn_menu.click();
		System.out.println("Clicked on Sign In on Menubar");
		
	}

	public void Enter_mail_to_Reg(String KeyWord) {
		// TODO Auto-generated method stub
		enter_mail_to_reg.sendKeys(KeyWord);
		System.out.println("Email entered to create Account");
		
	}

	public void Click_create_Accout() {
		// TODO Auto-generated method stub
		click_to_create_acc.click();
		System.out.println("Click Create Account to create Account");
		
	}
	
	public void Check_gender_button_to_Reg() {
		gender_btn.click();
		System.out.println("Checked Gender to create Account");
	  }
	  
	  public void Enter_first_name_for_reg(String Keyword) {
		enter_first_name_for_reg.sendKeys(Keyword);
		System.out.println("Enter Frist Name to create Account");
	  }
	  
	  public void Enter_Last_name_for_reg(String Keyword) {
		enter_last_name_for_reg.sendKeys(Keyword);
		System.out.println("Enter Last Name to create Account");
	  }
	  
	  public void Enter_Password_reg(String Keyword) {
		enter_password_for_reg.sendKeys(Keyword);
		System.out.println("Enter password to create Account");
	  }
	  
	  public void Select_birth_day() {
		dropdown_state.click();
		Select drop = new Select(birth_date);
	    drop.selectByIndex(1);
		System.out.println("Select Birth Day");
	  }
	  
	  public void Select_birth_month() {
		dropdown_state.click();
		Select drop = new Select(birth_month);
	    drop.selectByIndex(1);
		System.out.println("Select Birth Month");
	  }
	  
	  public void Select_birth_year() {
		dropdown_state.click();
		Select drop = new Select(birth_year);
	    drop.selectByIndex(1);
		System.out.println("Select Birth Year");
	  }
	  
	  public void Enter_first_name_for_address(String Keyword) {
		enter_first_name_for_address.sendKeys(Keyword);
		System.out.println("Enter First Name for address to create Account");
	  }
	  
	  public void Enter_last_name_for_address(String Keyword) {
		enter_last_name_for_address.sendKeys(Keyword);
		System.out.println("Enter Last Name for address to create Account");
	  }
	  
	  public void Enter_address(String Keyword) {
		enter_address.sendKeys(Keyword);
		System.out.println("Enter  address to create Account");
	  }
	  
	  public void Enter_city(String Keyword) {
		enter_city.sendKeys(Keyword);
		System.out.println("Enter  city to create Account");
	  }
	  
	  public void Select_dropdown_state() {
		dropdown_state.click();
		Select drop = new Select(dropdown_state);
	    drop.selectByIndex(1);
		System.out.println("Select State to create Account");
	  }
	  
	  public void Enter_post_code(String postcode) {
		post_code.sendKeys(postcode);
		System.out.println("Enter  postcode to create Account");
	  }
	  
	  public void Enter_additional_info(String Keyword) {
		enter_additional_info.sendKeys(Keyword);
		System.out.println("Enter  postcode to create Account");
	  }
	  
	  public void Enter_mobile_no(String Keyword) {
		enter_mobile_no.sendKeys(Keyword);
		System.out.println("Enter  Cell Number to create Account");
	  }
	  
	  public void Click_register_Button() {
		registerButton.click();
		System.out.println("Click Register to create Account");
	  }
	  
	  public String Verify_Registration() {
		System.out.println("Verify Account has created Successfully");
		return verify_Registration.getText();
		
	  }
	  

	  public void Click_Log_out() {
		  logout_btn.click();
		System.out.println("Logged Out");
	  }

	public String Verify_email() {
		// TODO Auto-generated method stub
		return verify_mail.getText();
		}
	
	public String No_Required_info() {
		return not_giving_required_info.getText();
	}

	public String Verify_Registration_invalid_pass() {
		// TODO Auto-generated method stub
		return invalid_pass.getText();
		
	}

	


}