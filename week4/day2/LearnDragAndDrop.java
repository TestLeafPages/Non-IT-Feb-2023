package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class LearnDragAndDrop {

	public static void main(String[] args) {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		//To disable the notification
		option.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(option);
		driver.get("https://www.leafground.com/drag.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
       //Find source
		WebElement source = driver.findElement(By.xpath("//div[@id='form:drag_content']"));
		//find destin
		WebElement des = driver.findElement(By.xpath("//div[@id='form:drop_header']"));
		//Actions
		Actions builder=new Actions(driver);
		builder.dragAndDrop(source, des).perform();
		 //verify
		System.out.println(des.getCssValue("background-color"));
		
		//Draggable
		//find the source element
		WebElement scr = driver.findElement(By.xpath("//span[text()='Drag me around']"));
		
		Point location = scr.getLocation();
		int x = location.getX();
		System.out.println(x);
		int y = location.getY();
		System.out.println(y);

		builder.dragAndDropBy(scr, 100, 50).perform();
		//verification
		System.out.println(scr.getLocation().getX());
		
		
		
		
		
	}

}
