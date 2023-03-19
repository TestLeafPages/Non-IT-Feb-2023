package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ScrollElement {

	public static void main(String[] args) throws IOException {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		//To disable the notification
		option.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(option);
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//find element
		WebElement help = driver.findElement(By.xpath("//a[text()='Contact Us']"));
		////Instantiating the actions class
		Actions builder =new Actions(driver);
		builder.scrollToElement(help).perform();
		
		//Take a snapshot
		File source = driver.getScreenshotAs(OutputType.FILE);
		//Create folder to save the img file
		File dest =new File("./snap/img1.png");
		//Merge sou and dec
		FileUtils.copyFile(source, dest);
		
		
		
		
		
		
	}

}
