package week4.day2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapShotCode {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver=new ChromeDriver();
		//Take a snapshot
				File source = driver.getScreenshotAs(OutputType.FILE);
				//Create folder to save the img file
				File dest =new File("./snap/img1.png");
				//Merge source and destination
				FileUtils.copyFile(source, dest);

	}

}
