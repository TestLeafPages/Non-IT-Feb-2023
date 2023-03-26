package week5.day2;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class LearnEnabled {
	@Test(enabled = false)
	public void editLead() {
		System.out.println("Edit");
	}
	
	@Test
	@Ignore
	public void createLead() {
		System.out.println("Create");
	}
    @Test
	public void duplicateLead() {
		System.out.println("duplicate");
	}
}
