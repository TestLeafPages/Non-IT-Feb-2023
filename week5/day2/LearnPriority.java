package week5.day2;
import org.testng.annotations.Test;
public class LearnPriority {
  
	@Test(priority =1)
	public void closeBrowser() {
		
		System.out.println("driver.close");
	}
	@Test(priority = 0)
	public void openBrowser() {
		System.out.println("driver.get(url)");
	}
	
	@Test
	public void createAccount() {
		System.out.println("Create Account");
	}
}
