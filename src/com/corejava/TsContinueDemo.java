package com.corejava;

public class TsContinueDemo 
{ 
	 public static void main(String[] args)
	   {
		 for(int i=0;i<=10;i++)
		 {
			 if(i==3)   //skip 3
	         continue;	
			 System.out.println(i);
		 }
	   }
}




/*o/p:-
0
1
2
4
5
6
7
8
9
10
*/