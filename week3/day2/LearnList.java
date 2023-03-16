package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		int num=20;
		Integer num1=40;
		System.out.println(num1.floatValue());
		//Declare the List
		List<String> name=new ArrayList<String>();
		//add the data into list
		name.add("charulatha");
		name.add("menaka");
		name.add("Sukanya");
		name.add("Banu");
		name.add("Bala");
		name.add("Bala");
		//Print my list
		System.out.println(name);
		//addAll
		List<String> name1=new ArrayList<String>();
		name1.addAll(name);
		name1.add("janil");
		System.out.println(name1);
		//remove
		name.remove(5);
		System.out.println(name);
		//particular index
		System.out.println(name.get(3));
		//To get the count or length of list
		System.out.println(name.size());
		//print all the element in list using for loop
		for (int i = 0; i <name.size(); i++) {
			System.out.println(name.get(i));
			
		}
		//To clear the data in list
		name.clear();
		System.out.println(name);
		
		//isEmpty
		System.out.println(name.isEmpty());
		//Sort the list
		Collections.sort(name1);
		System.out.println(name1);
		

	}

}
