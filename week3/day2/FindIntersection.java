package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {
	
	public static void main(String[] args) {
		
		//input: 
		int[] a = {3,2,11,4,6,7};
        int[] b = {1,2,8,4,9,7};
        
        //create a two empty Lists - list1 & list2
        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();
        
        
        
      //  Declare for loop iterator from 0 to array a.length and add into list1
        
		for(int i = 0; i < a.length; i++) {
			list1.add(a[i]);
		}
		
		//Declare for loop iterator from 0 to array b.length and add into another list2
		for (int j = 0; j < b.length; j++) {
			list2.add(b[j]);
			
		}
		System.out.println(list1);
		System.out.println(list2);
		
		//Compare Both list1 & list2 using a nested for loop
		for(int i = 0; i < list1.size(); i++) {
			for( int j = 0; j < list2.size(); j++) {
				if(list1.get(i) == list2.get(j)) {
					
					//Print the matching number
					System.out.println(list1.get(i));
				}
			}
				
		}
		
		
	}

}
