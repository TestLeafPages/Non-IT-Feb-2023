package testcase;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class TC_002_CreateLead extends ProjectSpecificMethod {
	@BeforeTest
	public  void setup() {
		excelFile="CreateLead";
	}
	
	@Test(dataProvider = "getData")
	public void runCreateLead(String uname,String pwd,String cname,String fname,String lname) throws IOException {
		LoginPage lp=new LoginPage(driver,node);
		lp.enterUserName(uname)
		.enterpassword(pwd)
		.clickLoginButton()
		.clickCrmSfa()
		.clickLead()
		.clickCreateLead()
		.enterCompanyname(cname)
		.enterfname(fname)
		.enterlname(lname)
		.clickCreateButton()
		.verifyFname();
	}

}
