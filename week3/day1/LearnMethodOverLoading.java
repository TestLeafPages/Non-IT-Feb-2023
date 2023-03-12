package week3.day1;

public class LearnMethodOverLoading {

	int a=50;//Global variable
	
	public int add() {
		int a = 100;
		//System.out.println(a);
		return a;
	}
	
   
	
	public static void main(String[] args) {
		
		
		LearnMethodOverLoading   obj = new LearnMethodOverLoading();

       System.out.println(obj.a);
       System.out.println(obj.add());
		
	
	
	
	
	}
}
