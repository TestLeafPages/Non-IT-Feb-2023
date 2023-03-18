package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IRCTC {

	public static void main(String[] args) {
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		//To disable the notification
		option.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(option);
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
       //Click on FLIGHTS link
		driver.findElement(By.linkText("FLIGHTS")).click();
		//Verify the title
		System.out.println(driver.getTitle());
		//Switch to the Flights window
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windows = new ArrayList<String>(windowHandles);	
		driver.switchTo().window(windows.get(1));
		//Print the Title of the Flights window
		System.out.println(driver.getTitle());
		//Close the Flights window alone
         driver.close();
        //Print the Train search window title (First window)
        //Switch back to main window
		driver.switchTo().window(windows.get(0));
		System.out.println(driver.getTitle());
		//close all the open window
		driver.quit();
		
		

	}

}
