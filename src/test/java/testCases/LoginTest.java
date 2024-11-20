package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class LoginTest extends BaseClass{
	
	@Test(priority = 1 )
	public void verify_Login() throws InterruptedException 
	{
		HomePage hp=new HomePage(driver);
		hp.clickcustomer();
		
		LoginPage lp=new LoginPage(driver);
//		lp.clickonPan();
		Thread.sleep(3000);
		lp.enterPan(p.getProperty("PAN"));
		lp.clickContinue1();
		lp.clickPwd(p.getProperty("Pwd"));
		lp.clickContinue2();
		
		String confmsg=lp.getConfirmation();
		Assert.assertEquals(confmsg, "Sales");
		
	}
	
	
}
