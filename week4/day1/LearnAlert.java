package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlert {

	public static void main(String[] args) throws InterruptedException {
		//WebDriverManager.chromedriver().setup();
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		//To disable the notification
		option.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(option);
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//click to populate the alert
		Thread.sleep(2000);
		//find the element
		driver.findElement(By.xpath("(//span[text()='Show'])[1]")).click();
		//handle the alert
		Alert simple = driver.switchTo().alert();
		//print msg present inside the alert box
		String text = simple.getText();
		System.out.println(text);
		//Action perform in alert
		simple.accept();
		//print after handle the alert
		String text2 = driver.findElement(By.xpath("//span[@id='simple_result']")).getText();
		System.out.println(text2);
		//Confirmation
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		
		Alert confirm = driver.switchTo().alert();//ctrl+2
		confirm.dismiss();
		//print
		String text3 = driver.findElement(By.xpath("//span[@id='result']")).getText();
		System.out.println(text3);
		

	}

}
