package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Add_CustomersPage extends BasePage{
	
	WebDriver driver;
	
	public Add_CustomersPage(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(xpath="//span[text()='Customers']")
	WebElement customers;
	
	
	public void clickCustomers(){
		customers.click();
		
	}


}
