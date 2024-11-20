package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class LoginPage extends BaseClass{
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	
	@FindBy(xpath="//input[@id='pan_no']")
	WebElement clickPan;
	
	@FindBy(xpath = "//input[@id='pan_no']")
	WebElement txtPan;
	
	@FindBy(xpath = "//button[@id='new_button']")
	WebElement clickContinue;
	
	@FindBy(xpath = "//input[@id='user_password']")
	WebElement clickPwd;
	
	@FindBy(xpath = "//button[@id='kt_sign_in_submit']")
	WebElement clickContinue2;
	
	@FindBy(xpath="//span[text()='Sales']")
	WebElement loginconfirmation;
	
	
	public void clickonPan() {
		clickPan.click();

	}

	public void enterPan(String panno) {
		txtPan.sendKeys(panno);
		
	}
	
	public void clickContinue1() {
		clickContinue.click();
	}
	
	public void clickPwd(String pwd) {
		clickPwd.sendKeys(pwd);
	}
	
	public void clickContinue2() {
		clickContinue2.click();
	}
	
	public String getConfirmation()
	{
		try {
			return(loginconfirmation.getText());
		} catch(Exception e) {
			return(e.getMessage());
		}
	}
	
	
}
