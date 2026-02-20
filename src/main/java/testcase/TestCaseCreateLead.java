package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class TestCaseCreateLead extends BaseClass{
	@BeforeTest
	public void setValues() {
		filename="POMCreateLead";
	}
	
	
	
	@Test(dataProvider="fetchData")
	public void createLead(String username, String password, String companyname, String firstname, String lastname) {
//	testing
	LoginPage lp = new LoginPage(driver);
	lp.enterUsername(username).enterPassword(password).clickLoginButton().clickCrmsfaLink()
    .clickLeadsLink().clickCreateLeadLink().enterCompanyName(companyname).enterFirstName(firstname)
    .enterLastName(lastname).clickCreateLeadButton().verifyLead();
}
}