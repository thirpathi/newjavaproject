package com.programs;

import java.util.Scanner;

public class ReverseNumber
{
	public static void main(String[] args) 
	{
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("new number is ");
		int n = input.nextInt();
		
		
		
		
    int num = n;                //num = 12345
	int rev = 0;
	
	while (num != 0)
	{
		
		rev = (rev * 10 + num % 10);
		num = num / 10;
	}
	
     System.out.println("Reverse Number is :: " + rev);
	
}
}




/*o/p:-
 
 * Reverse Number is :: 54321
 */
