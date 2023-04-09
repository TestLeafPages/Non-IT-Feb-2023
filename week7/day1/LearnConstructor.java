package week7.day1;

public class LearnConstructor {
	int x;
	String name;
    //Default
	public LearnConstructor() {
		System.out.println("Default constructor");
	}
	//Parameterized
	public LearnConstructor(int x,String name) {
		System.out.println("Parameterized constructor");
		System.out.println("Integer value:"+x+"String value"+name);
	}

	public static void main(String[] args) {//main
		LearnConstructor obj=new LearnConstructor();//invoke const
		LearnConstructor obj1=new LearnConstructor(10,"TestLeaf");
		System.out.println(obj.x);//print
		System.out.println(obj.name);
  
	}

}
