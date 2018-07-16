package com.programs;

import java.util.ArrayList;
import java.util.Scanner;

public class DinamicArray 
{
	public static void main(String[] args) 
	{
		//create Dinamic array
		ArrayList<Integer> x=new ArrayList<Integer>();
		//fill array with data 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a count of value");
		int c=sc.nextInt();
		for(int i=0;i<c;i++)
		{
		 System.out.println("Enter a value");
		 x.add(sc.nextInt());
		}
          //calculate total
		int tot=0;
		for(int i=0;i<c;i++)
		{
	     tot=tot+x.get(i);
		}
		System.out.println(tot);
	}

}
 


/* output
Enter a count of value
5
Enter a value
1
Enter a value
2
Enter a value
3
Enter a value
4
Enter a value
5
15
*/
