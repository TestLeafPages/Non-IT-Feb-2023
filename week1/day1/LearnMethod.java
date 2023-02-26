package week1.day1;

public class LearnMethod {
	int regNo=1234;
	//access return method(){
	//ctrl+space
   public  void applybreak()  {
	   String colour="silver";
	System.out.println("Break");
	System.out.println(colour);
		
	} 
	private void sounHorn() {
		System.out.println("sound");
	}
	void type() {
		System.out.println("default");
	}
	
	public static void main(String[] args) {
		//Create object for the class
		//classname obj name=new Classname();
		
		LearnMethod car=new LearnMethod();
		car.applybreak();
		car.sounHorn();
		System.out.println(car.regNo);
		System.out.println();
		
		
		
		
		
		
		
		
		
		
	}
}
