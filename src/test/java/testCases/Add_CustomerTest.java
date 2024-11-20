
package testCases;

import org.testng.annotations.Test;

import pageObjects.Add_CustomersPage;
import testBase.BaseClass;
import utilities.DataProviderClass;

public class Add_CustomerTest extends BaseClass {

	@Test(priority = 2, dataProvider = "CreateCustomer", dataProviderClass = DataProviderClass.class)
	public void addCustomersTest(String FormofBusiness, String LegalName, String TradeName, String RegisAdd,
			String Country, String State, String City, String PinCode, String FirstName, String LastName,
			String Emailid, String MobileNo) throws InterruptedException

	{
		Add_CustomersPage addcust = new Add_CustomersPage(driver);
		addcust.clickCustomers();
		addcust.addCustomer();
		addcust.selectOther();
		addcust.clickNext();
		addcust.selectFromOfBusiness(FormofBusiness);
		addcust.enterLegalName(LegalName);
		addcust.enterTradeName(TradeName);
		addcust.enterRegAdd(RegisAdd);
		addcust.enterState(State);
		addcust.enterCty(City);
		addcust.enterPin(PinCode);
		addcust.enterFirstNam(FirstName);
		addcust.enterLstNam(LastName);
		addcust.entEmail(Emailid);
		addcust.enterMobileNum(MobileNo);
		addcust.ClkSubmit();
	}

}
