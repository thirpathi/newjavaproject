package com.programs;

import java.util.Scanner;

public class PrimeNumber 
{
	public static void main(String[] args) 
	{
    // Get data from key board
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int x=sc.nextInt();
		// loop to check the number as Prime or Not
		int flag=0;
		for(int i=2;i<x;i++)
		{
		if(x%i==0)
		{
			flag=1;
			break;
		}
		}
		if (flag==0)
		{
			System.out.println(x+"is a prime number");
		}
		else
		{
			System.out.println(x+"is not a prime number");
		}
 	}

}


/* output
Enter a number
45
45is not a prime number

 Enter a number
3
3is a prime number
 */ 

