package testcase;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class TC_002_CreateLead extends ProjectSpecificMethod {
	@Test
	public void runCreateLead() {
		LoginPage lp=new LoginPage(driver);
		lp.enterUserName()
		.enterpassword()
		.clickLoginButton()
		.clickCrmSfa()
		.clickLead()
		.clickCreateLead()
		.enterCompanyname()
		.enterfname()
		.enterlname()
		.clickCreateButton()
		.verifyFname();
	}

}
