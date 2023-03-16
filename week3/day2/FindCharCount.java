package week3.day2;

public class FindCharCount {

	public static void main(String[] args) {

/*
 * String input="TestLeaf";
//To get the count of e;

Goal: To understand the String, loop, if 

a) Create a class by name: FindCharCount (with main method)
     initialize the count variable 
     count =0;
b)Convert the String to character array (use toCharArray)
c)Use forloop to iterate each character in the array
d)Compare with the input with the required character using if condition (==) 
e)if matches, keep adding the count. Finally, print the count.
f) Run and Confirm the correct character count is printed in console

 */
		String input="TestLeaf";
		int count=0;
		char[] charArray = input.toCharArray();//{'T','E',...}
		for (int i = 0; i < charArray.length; i++) {
			
			if(charArray[i]=='e') {
				count++;
			}
		}
		System.out.println(count);
		
		
		
	}

}
