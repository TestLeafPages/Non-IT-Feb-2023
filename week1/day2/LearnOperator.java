package week1.day2;

public class LearnOperator {

	public static void main(String[] args) {
		//Arithmetic operator
		System.out.println(1+2);
		System.out.println(2-2);
		System.out.println(2*2);
		System.out.println(4/2);
		System.out.println(4%2);
       //2.Assignment operators:
		int a=5,b = 10;
		//System.out.println(a=b);
		 a=a+5;
		 a+=5;
		 b-=10;
		//a=a+5;
		System.out.println(a);
		//3.Comparison operators:
		System.out.println(5==5);
		System.out.println(5<5);
		System.out.println(5<=5);
		System.out.println(5!=5);
		System.out.println(5>5);
		System.out.println(5>=5);
		//increment operator
		int c=1;
		System.out.println(++c);
		System.out.println(c++);//2
		System.out.println(c);//3
		System.out.println(--c);//2
		System.out.println(c--);//2
		System.out.println(c);
	}

}
