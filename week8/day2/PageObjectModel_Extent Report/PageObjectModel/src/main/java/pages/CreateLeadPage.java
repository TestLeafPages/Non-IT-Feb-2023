package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;

import base.ProjectSpecificMethod;

public class CreateLeadPage extends ProjectSpecificMethod{
	
	public CreateLeadPage(ChromeDriver driver,ExtentTest node) {
		this.driver=driver;
		this.node=node;
		
	}
	
	public CreateLeadPage enterCompanyname(String cname) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		return this;
		
	}

	public CreateLeadPage enterfname(String fname) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		return this;
		
	}
	public CreateLeadPage enterlname(String lname) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		return this;
		
		
	}
	public ViewLeadPage clickCreateButton() {
		
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadPage(driver,node);
	}
}
