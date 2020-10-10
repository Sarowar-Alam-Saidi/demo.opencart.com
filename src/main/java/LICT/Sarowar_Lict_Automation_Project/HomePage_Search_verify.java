package LICT.Sarowar_Lict_Automation_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import LICT.Sarowar_Lict_Automation_Project.*;

public class HomePage_Search_verify{
	WebDriver driver;

	public HomePage_Search_verify(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	

	@FindBy(xpath ="//input[@id='search_query_top']" )
	WebElement search_box;
	
	@FindBy(xpath ="//button[@name='submit_search']" )
	WebElement search_submit;
	
	@FindBy(xpath="//div[@class='right-block']//a[@class='product-name'][contains(text(),'Faded Short Sleeve T-shirts')]")
	WebElement select_tshirt;
	
	@FindBy(xpath="//a[@id='color_14']")
	WebElement select_color;
	
	@FindBy(xpath="//button[@name='Submit']")
	WebElement add_to_cart;
	
	@FindBy(xpath="//span[contains(text(),'Proceed to checkout')]")
	WebElement proceed_checkout;
	
	@FindBy(xpath="//a[@class='button btn btn-default standard-checkout button-medium']//span[contains(text(),'Proceed to checkout')]")
	WebElement con_proceed_checkout;
	
	@FindBy (xpath = "//h1[@class='page-heading']")
	WebElement con_user;
	
	@FindBy (xpath = "//p[contains(text(),'There is 1 error')]")
	WebElement log_error;
	//paths for log
	@FindBy (xpath="//input[@id='email']")
	WebElement input_email;

	@FindBy (xpath="//input[@id='passwd']")
	WebElement input_password;
	
	@FindBy (xpath="//p[@class='submit']//span[1]")
	WebElement click_sign_in_button;
	
	
	//path for reg
	
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
	 
	 @FindBy(name="processAddress")	
	 public WebElement proceed_before_final;
	 
	 @FindBy(id="cgv")	
	 public WebElement check_condition;
	 
	 @FindBy(name="processCarrier")	
	 public WebElement proceed_final;
	 
	 @FindBy(xpath="//a[@class='bankwire']")	
	 public WebElement bank_wire;
	 
	 @FindBy(xpath="//span[contains(text(),'I confirm my order')]")	
	 public WebElement pay_con;

	 @FindBy(xpath="//a[@class='logout']")	
	 public WebElement logout_btn;
	 
	 @FindBy(xpath="//strong[contains(text(),'Your order on My Store is complete.')]")
	 WebElement verify_purchase;
	 
	public void input_search_keyword(String keyword) {
		search_box.sendKeys(keyword);
		System.out.println("Input is taken");
	}
	
	
	public void input_search_submit() {
		search_submit.click();
		System.out.println("Submit is done");
	}
	
	public void Select_tshirt() {
		// TODO Auto-generated method stub
		select_tshirt.click();
		System.out.println("Selecting The Tshirt");
		
	}
	public void Select_color() {
		// TODO Auto-generated method stub
		select_color.click();
		System.out.println("Selecting Blue Color");
	}
	

	public void Add_to_cart() {
		// TODO Auto-generated method stub
		add_to_cart.click();
		System.out.println("Added to cart");
		
	}
	
	public void Proceed_to_checkout() {
		proceed_checkout.click();
		System.out.println("Proceed to checkout");
	}
	public void confirm_Proceed_to_checkout() {
		// TODO Auto-generated method stub
		con_proceed_checkout.click();
		System.out.println("Button Confirm Proceed to checkout");
		
	}
	public String confirm_user() {
		// TODO Auto-generated method stub
		return con_user.getText();
	}
	public String Log_error() {
		// TODO Auto-generated method stub
		return log_error.getText();
	}
	//Methos for LOG
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
	
	// methods for REGISTRATIION
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
	public void Before_Final_proceed() {
		// TODO Auto-generated method stub
		proceed_before_final.click();
		System.out.println("Proceed Address");
		
	}
	
	public void Check_condition() {
		// TODO Auto-generated method stub
		check_condition.click();
		System.out.println("Agree on conditions");
		
	}
	public void Final_proceed() {
		// TODO Auto-generated method stub
		proceed_final.click();
		System.out.println("Proceed Carrier");
		
	}
	  
	public void Pay_method() {
		// TODO Auto-generated method stub
		bank_wire.click();
		System.out.println("Payment Method");
		
	}
	public void Confirm_pay() {
		// TODO Auto-generated method stub
		pay_con.click();
		System.out.println("Confirm Payment");
		
	}
	  
	 public void Click_Log_out() {
		  logout_btn.click();
		System.out.println("Logged Out");
	  }

	 public String Verify_purchase() {
		 return verify_purchase.getText();
	 }
	

}
