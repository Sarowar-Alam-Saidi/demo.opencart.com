package LICT.Sarowar_Lict_Automation_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage_Subscribe_NewsLetter {
WebDriver driver;
	
	public Homepage_Subscribe_NewsLetter(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='newsletter-input']")	
	  public WebElement enter_email_to_subscribe;
	
	@FindBy(xpath="//button[@name='submitNewsletter']")	
	  public WebElement submitNewslettere;
	
	@FindBy(xpath="//p[@class='alert alert-success']")	
	  public WebElement subscription_done;
	
	@FindBy(xpath="//p[@class='alert alert-danger']")	
	  public WebElement already_subcribed;

	public void Enter_email_to_subscribe(String Keyword) {
		// TODO Auto-generated method stub
		enter_email_to_subscribe.sendKeys(Keyword);
		System.out.println("Entered Email to Subscribe");
		
	}

	public void Click_to_submit() {
		// TODO Auto-generated method stub
		submitNewslettere.click();
		System.out.println("Submit to Subscribe");
	}

	public String Verify_subscription() {
		// TODO Auto-generated method stub
		return subscription_done.getText();
		
	}
	
	public String Already_subscription() {
		// TODO Auto-generated method stub
		return already_subcribed.getText();
		
	}
	
	
	 //Newsletter : This email address is already registered. 
	// Newsletter : You have successfully subscribed to this newsletter.. 
	

}
