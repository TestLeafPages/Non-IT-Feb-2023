package week3.day2;

public class LearnString {

	public static void main(String[] args) {

//String Literal
		
		String s1="Welcome";
		String s3="TestLeaf";
		//String obj
		String s2=new String("Testleaf");
		
		//compare the String value equals
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		//memory of the string ==
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		//find Size of String
		//length start from 1 2...
		//index start from 0,1,2....
		 int length = s1.length();//ctrl+2
		System.out.println(length);
		System.out.println(s1);
		//To convert String Char
		char[] charArray = s1.toCharArray();//ctrl+2
		System.out.println(charArray);
		//to print all character
		for (int i = 0; i < charArray.length; i++) {
			System.out.println(charArray[i]);
		}
		
		//Reverse String a[0]=T a[7]=?
		for (int i =charArray.length-1 ; i >=0; i--) {
			System.out.println(charArray[i]);
		}
		//To check Leaf
		boolean contains = s1.contains("leaf");
		System.out.println(contains);
		if(s1.contains("leaf")|| s1.contains("Leaf")) {
			System.out.println("Is Present");
		}
		
		else {
			System.out.println("Not Present");
		}
		
		//Find the char
		char charAt = s1.charAt(1);
		System.out.println(charAt);
		//find the index
		
		int indexOf = s1.indexOf('e');
		System.out.println(indexOf);
		
		//1-16 of over 100,000 results for
		
		//SubString
		String s4="1-16 of over 100,000 results for";
		String substring = s4.substring(3);
		System.out.println(substring);
		String substring2 = s4.substring(12, 20);
		System.out.println(substring2);
		
		//Join the two string concat
		System.out.println(s1.concat(s3));
		System.out.println(s1+"  "+ s3);
		//To remove the space
		String s5="      Test   leaf     ";
		System.out.println(s5.trim());
		//To upper
		System.out.println(s1.toUpperCase());
		System.out.println(s3.toLowerCase());
		
		//replace the  string
		//replace the space with empty string
		System.out.println(s5.replace(" ", ""));
		//replaceAll use regular expression
		//print only number
		String replaceAll = s4.replaceAll("[^0-9]", "");//ctrl+2
		System.out.println(replaceAll);
		//print only alphabets
		String replaceAll2 = s4.replaceAll("\\d", "");
		System.out.println(replaceAll2);

	}

}
