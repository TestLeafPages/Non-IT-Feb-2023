package week1.day2;

public class LearnCondition {

	public static void main(String[] args) {
		//18 eligible for vote
		int age=17;
		if(age>=18) {
			System.out.println("Eligible for vote");
		}
		else {
			System.out.println("Not Eligible");
		}
		
		//write the condition for checking the mark
		int mark=0;
		if(mark==35) {
			System.out.println("pass");
		}
		else if((mark<=30)&&(mark>=34)) {
			System.out.println("fail");
		}
		else if(mark>=90) {
			System.out.println("Grade A");
		}
		else {
			System.out.println("error");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
