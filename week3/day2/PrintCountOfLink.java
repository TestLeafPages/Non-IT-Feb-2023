package week3.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class PrintCountOfLink {

	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/link.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[contains(text(),'How many link')]")).click();
		List<WebElement> count = driver.findElements(By.tagName("a"));
		int size = count.size();
		System.out.println(size);

	}

}
