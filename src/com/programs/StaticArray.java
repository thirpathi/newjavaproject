package com.programs;

import java.util.Scanner;

public class StaticArray 
{

	public static void main(String[] args) 
	{
		//create 5 values static array
		int x[]=new int[5];
		// fill array with 5 values
		Scanner sc=new Scanner(System.in);
		for (int i=0;i<5;i++)
		{
		 System.out.println("Enter a number");
         x[i]=sc.nextInt();
        }
		// calculate total
		int tot=0;
		for (int i=0;i<5;i++)
		{
		tot=tot+x[i];
		}
		System.out.println(tot);		
	}

}

/* output
Enter a number
6
Enter a number
5
Enter a number
8
Enter a number
9
Enter a number
7
35
*/