package week5.day2;

import org.testng.annotations.Test;

public class LearnInvocation {

	@Test(invocationCount = 3,invocationTimeOut = 3000,threadPoolSize = 2)
	public void create() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("create Lead");
	}
	@Test
	public void edit() {
		System.out.println("edit Lead");
	}
	@Test
	public void delete() {
		System.out.println("delete Lead");
	}
	
	
}
