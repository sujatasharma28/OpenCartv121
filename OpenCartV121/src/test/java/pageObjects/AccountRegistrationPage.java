package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {

	public AccountRegistrationPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//input[@id='input-firstname']")
	WebElement txtFirstName;
	
	@FindBy(xpath = "//input[@id='input-lastname']")
	WebElement txtLastName;
	
	@FindBy(xpath = "//input[@id='input-email']")
	WebElement txtemail;
	
	@FindBy(xpath = "//input[@id='input-telephone']")
	WebElement txtPhoneNumber;
	
	@FindBy(xpath ="//input[@id='input-password']")
	WebElement txtPassword;
	
	@FindBy(xpath = "//input[@id='input-confirm']")
	WebElement txtConfirmPassword;
	
	@FindBy(xpath ="//input[@name='agree']")
	WebElement checkPolicy;
	
	@FindBy(xpath = "//input[@value='Continue']")
	WebElement btnContniue;
	
	@FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']" )
	WebElement confirmMessage;
	
	
	public void setFirstName(String fname) {
		txtFirstName.sendKeys(fname);
	}
	
	public void setLastName(String lname) {
		txtLastName.sendKeys(lname);
	}
	
	public void settxtemail(String email) {
		txtemail.sendKeys(email);
	}
	
	public void settxtPhoneNumber(String tel) {
		txtPhoneNumber.sendKeys(tel);
	}
	
	public void settxtPassword(String psw) {
		txtPassword.sendKeys(psw);
	}
	
	public void settxtConfirmPassword(String cpsw) {
		txtConfirmPassword.sendKeys(cpsw);
	}
	
	public void setCheckPolicy() {
		checkPolicy.click();
	}
	
	public void clickContinue() {
		btnContniue.click();
	}
	
	public String getconfirmMessage() {
		try{
			return (confirmMessage.getText());
		}catch (Exception e) {
			return (e.getMessage());
		}
		
	}
	

}
