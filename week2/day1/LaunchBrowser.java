package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		//Launch the browser
		//EdgeDriver driver=new EdgeDriver();
		ChromeDriver driver=new ChromeDriver();
		//Load the url
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//first page title
		 String title = driver.getTitle();//ctrl+2+l
		 System.out.println(title);//print the title in console
		
		 //Find the element and Enter the UserName
	   driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	   
	   //Find the element and Enter the password
	   driver.findElement(By.id("password")).sendKeys("crmsfa");
	   
	   //Click the login button
	   driver.findElement(By.className("decorativeSubmit")).click();
	 
	   //verify page load
	   //get the title page
		System.out.println(driver.getTitle());
		
	  //find the element and click
		driver.findElement(By.linkText("CRM/SFA")).click();
		
     //click lead buttton
		driver.findElement(By.linkText("Leads")).click();
		
		//click CreateLead
		driver.findElement(By.partialLinkText("Create")).click();
		Thread.sleep(2000);
		//Enter the Company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		
		//Find Element Enter the FirstName
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Princila");
		
		//Find Element Enter the Last name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("edward");
		
		//1.Find the dropdown
		
				WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));//ctrl+2+l
				
				//2.create object for Select Class
				
				Select drop1=new Select(source);
				//Choose method to pick the option
				//drop1.selectByIndex(4);
				Thread.sleep(2000);
				//drop1.selectByValue("LEAD_PARTNER");
				drop1.selectByVisibleText("Website");
				
		//Click Create Lead
		driver.findElement(By.name("submitButton")).click();
		
		//To verify the lead created
		//getText
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		
		System.out.println(text);
		
		if(text.contains("Testleaf")) {
			System.out.println("Lead is created");
		}
		else {
			System.out.println("Lead is Not created");
		}
			
		//close the browser
		driver.close();
		
	}

}
