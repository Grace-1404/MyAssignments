package week1.day2;

public class FibbonacciSeries {

	
	public static void main(String[] args) {
		
		//Print Fibbinocci series for first 11 numbers
		
       int  n = 11, num1 = 0, num2 =1;
       
		//Iterate from 1 to the 11
       
       for (int i =1; i<=n; ++i) {
    	   
    	   System.out.println(num1 + " ");
    	   
    	   int sum = num1 + num2;
    	   num1 = num2;
          num2 = sum;
          
   	   
    	       	   
    	       	   
    	   
       }
		
		
		
	}
}
