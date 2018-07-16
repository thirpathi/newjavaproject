package com.programs;

public class PrintTringle 
{
	public static void main(String[] args)
	{
		
	 for(int j=1;j<=5;j++)
	 {
      for(int i=5;i>j;i--)
      {
       System.out.print(" ");
	  }
      
	 //Display * first tringle
      for(int k=1;k<=j;k++)
      {
       System.out.print("*");
      }
      
     // Display * second tringle
      for(int l=1;l<j;l++)
      {
        System.out.print("*");
      }
      // Goto next line
      System.out.print("\n");

	}
	}
}

/* output
    *
   ***
  *****
 *******
*********
*/
