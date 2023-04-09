package week7.day1;

public class LearnStatic {
	public static int x;//static var
	 String name;//Non Static var
	
	 //Static method
	public static void print() {
		System.out.println("I am printed");
	}
	//Non static method
	public  void write() {
		System.out.println("I am written");
	}

	public static void main(String[] args) {
		
	
		LearnStatic obj=new LearnStatic();
		
		System.out.println(x);
		System.out.println(obj.name);
		
		print();
		obj.write();
		

	}

}
