package week2.day2;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learnwait {

	public static void main(String[] args) {

ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://login.salesforce.com/");
//wait
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
driver.findElement(By.id("password")).sendKeys("Leaf@123");
driver.findElement(By.id("Login")).click();
driver.findElement(By.className("slds-icon-waffle")).click();
//Example for Ruto extension
//driver.findElement(By.xpath("//label[text()='Username']/following-sibling::input"));
//String uSERNAME = driver.findElement(By.xpath("//label[text()='Username']/following::input")).getAttribute("attribute_value");
	}

}
