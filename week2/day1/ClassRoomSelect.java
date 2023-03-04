package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ClassRoomSelect {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/select.xhtml");
		WebElement tool = driver.findElement(By.className("ui-selectonemenu"));
		Select drop=new Select(tool);
		//drop.selectByVisibleText("Playwright");
		drop.selectByIndex(1);
	}

}
