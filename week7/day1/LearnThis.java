package week7.day1;

public class LearnThis {
	
	int x;
	String name;
	
	//default
	public LearnThis() {
		this(10,"TestLeaf");
		System.out.println("Default Constructor");
	}
	//one parameter cons
	public LearnThis(int x) {
		this();
		this.x=x;
		System.out.println(this.x);
	}
	//Two Parameter
	public LearnThis(int x,String name) {
		
		System.out.println(x +"and"+name);
	}

	public static void main(String[] args) {
		LearnThis obj=new LearnThis(15);
		System.out.println(obj.x);

	}

}
