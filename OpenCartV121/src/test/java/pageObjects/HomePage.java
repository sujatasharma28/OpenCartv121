package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	
	public HomePage(WebDriver driver)
		{
		super(driver);
	    }
	
	@FindBy(xpath= "//span[normalize-space()='My Account']")
	WebElement lnkAccount;
	
	@FindBy(xpath= "//a[normalize-space()='Register']")
	WebElement lnkRegister;
	
	
	public void clickMyAccount()
	{
		lnkAccount.click();
	}
	
	public void clickRegister()
	{
		lnkRegister.click();
	}
	
}
