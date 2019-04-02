package com.programs;

import java.util.Scanner;

public class ReverseString
{

	public static void main(String[] args)
	{
		
		Scanner input = new Scanner(System.in);
		System.out.println("String name is ");
		String n = input.nextLine();
		
		
		String s = n;          // s = "selinium";
		
		int len = s.length();
		String rev = "";
		
		for(int i=len-1; i>=0;i--)
		{
			rev = rev+s.charAt(i);
		}
		System.out.println(rev);
		
		
		System.out.println("********************************************");
		
		StringBuilder sb = new StringBuilder(s);  // mutable
		//StringBuffer sb = new StringBuffer(s);  // mutable
		System.out.println(sb.reverse());
     
	}
	
}
/*o/p:-
 
  muiniles
*/
