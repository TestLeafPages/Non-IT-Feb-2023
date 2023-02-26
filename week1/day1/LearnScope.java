package week1.day1;

public class LearnScope {

	
	public String print() {
	  String name="Testleaf";
		
	  return name;
	}

	public static void main(String[] args) {
		LearnMethod obj=new LearnMethod();
		System.out.println(obj.regNo);
		obj.applybreak();
		obj.type();
		//create object for same class
		LearnScope scope=new LearnScope();
		scope.print();
		
	}
}
