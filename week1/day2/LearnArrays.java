package week1.day2;

import java.util.Arrays;

public class LearnArrays {

	public static void main(String[] args) {
		//arrays declarations
		int[] value= {98,87,93,91,90,91,90};//data
		
		int[] nums=new int[10];//size
		nums[0]=56;
		nums[1]=45;
		nums[2]=32;
		
		//find the length of array
		int len = value.length;       //ctr+2+l To assign the local varibale ctrl+2
		
		System.out.println(len);
		
		System.out.println("First index :"+value[0]);
		//System.out.println(value[5]);
		
		//to arrange the arrays in ascending order
		Arrays.sort(value);
		
		for (int i = 0; i <value.length; i++) {
			System.out.println(value[i]);
			//value[0]
			//value[1]
		}
		
		//last index 
		
		System.out.println("last index:"+value[len-1]);
		
		System.out.println("second largest num"+value[len-2]);
		
		System.out.println(value[value.length-2]);
		
		
		//reverse order
		for (int i = value.length-1; i>=0; i--) {
			System.out.println(value[i]);
		}
		
		
		
		
		
		
		
		

	}

}
