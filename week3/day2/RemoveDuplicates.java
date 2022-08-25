package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		//Declare a String as PayPal India
		String name = "PayPal India";
		
		//Convert it into a character array
		for(int i=0; i < name.length(); i++) {
			char c = name.charAt(i);
			System.out.println(c);
		
	//Declare a Set as charSet for Character
			Set<Character> charSet=new HashSet<Character>();
			
			//Declare a Set as dupCharSet for duplicate Character
			Set<Character> dupCharSet=new HashSet<Character>();
		//Iterate character array and add it into charSet
			for(int j = 0; j<name.length(); j++ ) {
				if(charSet.contains(name.charAt(i))) {
					dupCharSet.add(name.charAt(i));
					
				}else {
					charSet.add(name.charAt(i));
				}
			}
		
			System.out.println("Unique letters : "+charSet);
	        System.out.println("Duplicate letters : "+dupCharSet);
	        for (Character letter:dupCharSet) {
	            if(charSet.contains(letter)){
	                charSet.remove(letter);
	            }
	        
	        }
	        System.out.println("After removing duplicates");
	        System.out.println("Unique letters : "+charSet);
	        System.out.println("Duplicate letters : "+dupCharSet);
		
		
		
		
		
		
		
		
	}
}
}