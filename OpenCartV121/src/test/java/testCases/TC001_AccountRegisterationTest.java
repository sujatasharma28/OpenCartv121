package testCases;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC001_AccountRegisterationTest extends BaseClass {

	
	@Test
	public void verify_account_registeration() {
		
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		hp.clickRegister();
		
		AccountRegistrationPage regpage = new AccountRegistrationPage(driver);
		regpage.setFirstName(randomString().toUpperCase());
		regpage.setLastName(randomString().toUpperCase());
		regpage.settxtPhoneNumber(randomNumber());
		regpage.settxtemail(randomString()+"@gmail.com");
		
		String psw = randomAlphanumeric();
		regpage.settxtPassword(psw);
		regpage.settxtConfirmPassword(psw);
		
		regpage.setCheckPolicy();
		regpage.clickContinue();
		String confirmationMessage = regpage.getconfirmMessage();
		Assert.assertEquals(confirmationMessage, "Your Account Has Been Created!");
	}
	
	
	
}
