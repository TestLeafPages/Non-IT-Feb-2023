package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;

import base.ProjectSpecificMethod;

public class HomePage extends ProjectSpecificMethod{
	
	public HomePage(ChromeDriver driver,ExtentTest node) {
		this.driver=driver;
		this.node=node;
	}

	public MyHomePage clickCrmSfa() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage(driver,node);
	}
	public void logOut() {
		
	}
}
