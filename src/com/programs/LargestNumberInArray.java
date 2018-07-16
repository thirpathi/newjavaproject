package com.programs;

import java.util.Arrays;

public class LargestNumberInArray 
{
  public static void main(String[] args)
  {
	 int numbers[] = {1,10,20,30,500};
	 
	 int largest = numbers[4];
	 int smallest = numbers[4];
	 
	 
	 for( int i=0;i<numbers.length;i++)
	 {
		 if(numbers[i]>largest)
		 {
			 largest = numbers[i];
		 }
		 else if(numbers[i]<smallest)
		 {
			 smallest = numbers[i];
		 }
	 }
	 
	 System.out.println("In Array Is::" + Arrays.toString(numbers));
	 
	 System.out.println("the largest number is " +largest );
	 System.out.println("the smallest number is " +smallest );

   }
}




/*o/p:-
In Array Is::[10, 20, 30, 500]
the largest number is 500
the smallest number is 10
*/