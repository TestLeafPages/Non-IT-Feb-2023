package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnXpath {

	public static void main(String[] args) throws InterruptedException  {
		//Launch the browser
		//EdgeDriver driver=new EdgeDriver();
		ChromeDriver driver=new ChromeDriver();
		//Load the url
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//wait
		
		 //Find the element and Enter the UserName
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager",Keys.ENTER);
	   
	   //Find the element and Enter the password
	   driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
	   
	   //Click the login button
	   driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
	   //click crmsfa
	   driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
	   
	   
	   Thread.sleep(2000);
	   

	   //click the lead
	   driver.findElement(By.xpath("//a[text()='Leads']")).click();
	   
	   
	   
	   
	   
	 
	}
}