package base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import util.ReadData;

public class ProjectSpecificMethod {

	public  ChromeDriver driver;
	public String excelFile;
	@BeforeMethod
	public void launchBrowser() {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(option);
		System.out.println(driver);
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
	@DataProvider(name="getData")
	public String[][] getdata() throws IOException {
		String[][] inputData = ReadData.inputData(excelFile);
		return inputData;
	}
}
