package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class CreateLeadPage extends ProjectSpecificMethod{
	
	public CreateLeadPage(ChromeDriver driver) {
		this.driver=driver;
		
	}
	
	public CreateLeadPage enterCompanyname() {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		return this;
		
	}

	public CreateLeadPage enterfname() {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Princila");
		return this;
		
	}
	public CreateLeadPage enterlname() {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Edward");
		return this;
		
		
	}
	public ViewLeadPage clickCreateButton() {
		
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadPage(driver);
	}
}
