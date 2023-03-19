package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnTable {

	public static void main(String[] args) {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		//To disable the notification
		option.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(option);
		driver.get("https://www.leafground.com/table.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//Locate  the table
		WebElement table = driver.findElement(By.xpath("(//table[@role='grid'])[2]"));
       //Row 
		List<WebElement> rowCount = table.findElements(By.tagName("tr"));
		System.out.println("Row Count"+rowCount.size());
		//Alternate
		List<WebElement> row = driver.findElements(By.xpath("(//table[@role='grid'])[2]//tr"));
		System.out.println(row.size());
		//column count
		List<WebElement> column = table.findElements(By.tagName("th"));
		
		System.out.println("Column Count"+column.size());
		//To print particular element in the table
		String text = driver.findElement(By.xpath("(//table[@role='grid'])[2]//tr[2]/td[2]")).getText();
        System.out.println(text);
        //Dynamic value
        for (int a = 1; a < rowCount.size(); a++) {
			String text2 = driver.findElement(By.xpath("(//table[@role='grid'])[2]//tr["+a+"]/td[2]")).getText();
	        System.out.println(text2);
        
        }
        //print all the rows and column
        for (int i = 1; i < rowCount.size(); i++) {
        	for (int j = 1; j < column.size(); j++) {
        		String text2 = driver.findElement(By.xpath("(//table[@role='grid'])[2]//tr["+i+"]/td["+j+"]")).getText();
			     System.out.println(text2);
        	}
			
		}
       
		}
        
        
}
