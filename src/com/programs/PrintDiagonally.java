package com.programs;

public class PrintDiagonally 
{
	public static void main(String[] args)
	{
	// Display * sysmbols in diagonally
      for(int j=1;j<=5;j++)
      {
    	  //for spaces
    	 for(int i=1;i<j;i++)
    	 {
    		 System.out.print(" ");
    	 }
    	// Display * and goto next line
		 System.out.print("*\n");
      }
	}
}



/*o/p:-
*
 *
  *
   *
    *   
*/

