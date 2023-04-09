package week7.day1;

public class SubClass extends LearnFinal{
	
	public SubClass() {
		super();
		System.out.println("Child Class");
	}
	
	
	/*
	 * public void empDetail() { System.out.println(super.id); super.empDetail(); }
	 */
	public final void run() {
		   System.out.println("Run");
	   }


	public static void main(String[] args) {
		SubClass obj=new SubClass();
		//obj.empDetail();
		System.out.println(LearnStatic.x);
		
		
	}

}
