package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class HomePage extends BaseClass{
	
	WebDriver driver;
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	
	@FindBy(xpath= "//span[text()='Customer']")
	WebElement custclick;
	
	public void clickcustomer()
	{
		custclick.click();
	}

}
