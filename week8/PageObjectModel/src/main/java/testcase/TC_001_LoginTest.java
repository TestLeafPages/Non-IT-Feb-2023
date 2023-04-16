package testcase;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class TC_001_LoginTest extends ProjectSpecificMethod {
@Test
	public void runLogin() {
		LoginPage lp=new LoginPage(driver);
		lp.enterUserName().enterpassword().clickLoginButton();
	}
}
