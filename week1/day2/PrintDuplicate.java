package week1.day2;

public class PrintDuplicate {
public static void main(String[] args) {
	
	int[] arr= {14,12,1,14,2,1,4,5,6};
	//14 1
	//to take the data one by one
	for (int i = 0; i < arr.length; i++) {
		
		for (int j = i+1; j < arr.length; j++) {
			if(arr[i]==arr[j]) {
				System.out.println(arr[i]);
			}
			
		}
		
	}
	
	
	
	
	
	
}
}
