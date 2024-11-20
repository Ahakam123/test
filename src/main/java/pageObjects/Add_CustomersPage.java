package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import testBase.BaseClass;

public class Add_CustomersPage extends BaseClass {

	WebDriver driver;

	public Add_CustomersPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}

	@FindBy(xpath = "//span[text()='Customers']/ancestor::span")
	WebElement customers;
	
	@FindBy(xpath = "//span[text()='Customers']")
	WebElement customers1;

	@FindBy(xpath = "//button[text()='Add Customer']")
	WebElement add_custmomer;

	@FindBy(xpath = "//input[@id=\"other_radio\"]")
	WebElement select_other;

	@FindBy(xpath = "//button[@id=\"signupbtn_place\"]")
	WebElement click_next;

	@FindBy(id = "form_of_business")
	WebElement formOfBusinessDrpdwn;

	@FindBy(xpath = "//input[@id=\"legal_name\"]")
	WebElement entlglname;

	@FindBy(xpath = "//input[@id=\"trade_name\"]")
	WebElement enttrdrdname;

	@FindBy(xpath = "//input[@id=\"area\"]")
	WebElement regadd;

	@FindBy(xpath = "//input[@aria-controls=\"select2-country-results\"]")
	WebElement entctry;

	@FindBy(id = "state")
	WebElement entstat;

	@FindBy(xpath = "//input[@name='city']")
	WebElement entrcty;

	@FindBy(xpath = "//input[@id='pincode']")
	WebElement entpin;

	@FindBy(xpath = "//input[@name='contact_name']")
	WebElement fstname;

	@FindBy(xpath = "//input[@name='last_name']")
	WebElement entlstnam;

	@FindBy(xpath = "//input[@name='email']")
	WebElement enteml;

	@FindBy(id = "mobile_no")
	WebElement mobilePhone;

	@FindBy(id = "customer_signup_submit")
	WebElement clkSumt;

	public void clickCustomers()  {
		
		Actions act = new Actions(driver);
		act.moveToElement(customers).build().perform();
		customers1.click();
	}

	public void addCustomer() {
		add_custmomer.click();
	}

	public void selectOther() {
		select_other.click();
	}

	public void clickNext() {
		click_next.click();
		
	}
	
	public void selectFromOfBusiness(String visibleText)  {
		Select sc = new Select(formOfBusinessDrpdwn);
		sc.selectByVisibleText(visibleText);
	
	}

	public void enterLegalName(String legalName) {
		entlglname.sendKeys(legalName);
		
	}

	public void enterTradeName(String tradeName) {
		enttrdrdname.sendKeys(tradeName);
		
	}

	public void enterRegAdd(String regAdd)  {
		regadd.sendKeys(regAdd);
		
	}

	public void enterState(String state)  {
		Select sc = new Select(entstat);
		sc.selectByVisibleText(state);
		
	}

	public void enterCty(String city) {
		entrcty.sendKeys(city);
	
	}

	public void enterPin(String pincode) {
		entpin.sendKeys(pincode);
	
	}

	public void enterFirstNam(String firstName) {
		fstname.sendKeys(firstName);
	
	}

	public void enterLstNam(String lastName) {
		entlstnam.sendKeys(lastName);
	
	}

	public void entEmail(String email) {
		enteml.sendKeys(email);
	
	}

	public void enterMobileNum(String mobNum) {
		mobilePhone.sendKeys(mobNum);
	
	}

	public void ClkSubmit() {
		clkSumt.click();
	
	}


}
