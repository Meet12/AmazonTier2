package amazonsignup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_POM {
	
	WebDriver driver;
	
	@FindBy(name="customerName") WebElement name;
	@FindBy(id="ap_email") WebElement email;
	@FindBy(id="ap_password") WebElement password;
	@FindBy(id="ap_password_check") WebElement passwordcheck;
	@FindBy(id="continue") WebElement continuebutton;
	
public Amazon_POM(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}
	
	
public void typename(String amazonname) {
		
		name.sendKeys(amazonname);
	}
	
	public void typeemail(String amazonemail) {
		
		email.sendKeys(amazonemail);
	}
	
	public void typepassword(String amazpass) {
		
		password.sendKeys(amazpass);
	}
	
	public void typepasswordcheck(String amazpasscheck) {
		
		passwordcheck.sendKeys(amazpasscheck);
	}
	
	public void clickbutton() {
		
		continuebutton.click();
		
	}


}
