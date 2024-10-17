package testCases;


import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class LoginTest extends BaseClass{
	
	@Test(priority = 1)
	public void verify_Login()
	{
		HomePage hp=new HomePage(driver);
		hp.clickcustomer();
		
		LoginPage lp=new LoginPage(driver);
		lp.clickonPan();
		lp.enterPan("AACCN8253B");
		lp.clickContinue1();
		lp.clickPwd("Atul@1234");
		lp.clickContinue2();
		
		String confmsg=lp.getConfirmation();
		Assert.assertEquals(confmsg, "Sales");
		
	}
	
	
}
