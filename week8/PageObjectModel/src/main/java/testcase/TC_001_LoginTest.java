package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class TC_001_LoginTest extends ProjectSpecificMethod {
	@BeforeTest
	public  void setup() {
		excelFile="LoginBook";
	}
@Test(dataProvider = "getData")
	public void runLogin(String uname,String pwd) {
		LoginPage lp=new LoginPage(driver);
		lp.enterUserName(uname).enterpassword(pwd).clickLoginButton();
	}
}
