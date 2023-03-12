package week3.day1;

public class BMW extends Vehicle {
	
	public void applyBreak() {
		System.out.println("abs");
	}
	
	
	
	public static void main(String[] args) {
		Vehicle	 obj=new BMW();
		obj.applyBreak();
		
		
		
	}

}
