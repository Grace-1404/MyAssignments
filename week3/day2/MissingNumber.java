package week3.day2;

import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {
     
	public static void main(String[] args) {
		
		int[] data = {1,5,2,9,10,8,6,5,1,3,6,9,7,10};
		Set<Integer> set = new TreeSet<Integer>();
		for(Integer integer : data) {
			set.add(integer);
			
			
		}
		System.out.println(set);
		//Iterate from the starting number and verify the next number is + 1
		for(int i = 0; i < set.size(); i++) {
			if(set.contains(i+1)) {
				continue;
			}
			else {
				System.out.println("Missing number is:" +(i+1));
			}
		}
			
		
		
		
		
		
	}
	
}
