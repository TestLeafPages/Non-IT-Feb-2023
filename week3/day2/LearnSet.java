package week3.day2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
		//Declare the set
	Set<Integer> nums=new TreeSet<Integer>();
	//Set<Integer> nums=new LinkedHashSet<Integer>();
	//Set<Integer> nums=new HashSet<Integer>();
	//add the data into set
	nums.add(10);
	nums.add(20);
	nums.add(30);
	nums.add(40);
	nums.add(5);
	nums.add(15);
	//Print  the set
	System.out.println(nums);
	//remove element in set
	nums.remove(20);
	//verify remove() return true or false
	System.out.println(nums.remove(20));
	//print the list to check element removed or not
	System.out.println(nums);
	//print the size of the set
	System.out.println(nums.size());
	//for each Loop
	//set not support get()
	for (Integer var : nums) {
		System.out.println(var);
	}
	
	
	}

}
