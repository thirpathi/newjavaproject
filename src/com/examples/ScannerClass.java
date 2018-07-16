package com.examples;   

import java.util.Scanner;

public class ScannerClass
{
	 public static void main(String args[]) 
	  { 
		  System.out.println("enter a number");
		  Scanner  s= new Scanner(System.in);  // From keyboard
		  int y = s.nextInt();
		  
		 if(y%2==0)
		 {
			 System.out.println(y+ " is even number");
		 }
		 else
		 {
			 System.out.println(y+ " is odd number");

		 }
	  } 
	

}
