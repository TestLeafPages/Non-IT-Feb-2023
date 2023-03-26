package week5.day2;

import org.testng.annotations.Test;

public class LearnDependsOnmethod {
	@Test
	public void create() {
		System.out.println("Create");
		throw new RuntimeException();
	}
	@Test(dependsOnMethods = "create",alwaysRun = true)
	public void edit() {
		System.out.println("edit");
	}
	@Test(timeOut = 1000)
	public void duplicate() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("duplicate");
	}

}
