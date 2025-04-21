package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC003_LoginDDT extends BaseClass{

	
	
	@Test(dataProvider= "LoginData", dataProviderClass = DataProviders.class, groups = "datadriven") //getting data provider from different class
	public void verify_loginDDT(String email, String psw, String exp){
     logger.info("********Starting TestCase003*********");
		try{
		//HomePage
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		hp.clickLogin();
		
		//Login page
		LoginPage lp = new LoginPage(driver);
		lp.setEmail(email);
		lp.setPassword(psw);
		lp.clickLogin();
		
		//MyAccount page
		
		MyAccountPage macc = new MyAccountPage(driver);
		boolean targetPage = macc.isMyAccountPageExist();
		
		if(exp.equalsIgnoreCase("Valid")) {
			if(targetPage = true) {
				macc.clickLogout();
				Assert.assertTrue(true);
			}else {
				Assert.assertTrue(false);
			}
		}
		if(exp.equalsIgnoreCase("Invalid")){
			if(targetPage = true) {
				macc.clickLogout();
				Assert.assertTrue(false);
			}else {
				Assert.assertTrue(true);
			}
			
		}
		}catch(Exception e) {
			
			Assert.fail();
		}
		
		logger.info("********Finished TestCase003*********");
	}
}
