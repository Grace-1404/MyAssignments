package week1.day2;

import java.util.Arrays;

public class LearnArrays {
public static void main(String[] args) {
	for (int i = 51; i<=77; i++)
	{
		if(i%2!=0)
		{
			System.out.println(+i);
		}
	}
}


public void secondLargestNumber() {
	int[] num = {22, 67, 98, 1, 34, 58, 99};
    Arrays.sort(num);
	int length =num.length;
	System.out.println("Second Largest no:" + num[length-2]);
	

}	
}
