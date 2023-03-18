package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class W3School {

	public static void main(String[] args) {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		//To disable the notification
		option.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(option);
		driver.get(" https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //Handle the frame
		driver.switchTo().frame("iframeResult");
		//Find the element to click
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		//Handle the Alert
		Alert alert = driver.switchTo().alert();//ctrl+2
		//Accept action
		alert.accept();
		//Get the text in this page
		String text = driver.findElement(By.id("demo")).getText();
		//verify the text present
		if (text.contains("OK")) {
			System.out.println("Success");
		} else {
			System.out.println("Failure");
		}
	}

	}

