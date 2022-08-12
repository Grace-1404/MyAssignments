package week1.day2;

public class FindIntersection {
 
	public static void main(String[] args) {
		
		//declare an arr1
		
		int[] arr1 = {3,2,11,4,6,7};
		
		//declare an arr2
		 
		int[] arr2 = {1,2,8,4,9,7};
		
		// Declare for loop iterator from 0 to array length
		
		for (int i = 0; i<=arr1.length-1; i++) {
			
			//Declare a nested for another array from 0 to array length
			
			for(int j=0; j<=arr2.length-1; j++) {
				
				//Compare Both the arrays using a condition statement
				
				if (arr1[i] == arr2[j]) {
			
					//Print the first array
					
					System.out.println(arr1[i]);
					
				}
			}
		}
			
		
	}
}
