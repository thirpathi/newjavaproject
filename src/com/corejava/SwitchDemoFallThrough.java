package com.corejava;

public class SwitchDemoFallThrough 
{
	public static void main(String[] args) 
	{
	String browser="ie";
	switch(browser)
	{
	
		case "ie":
			System.out.println("launching ie");
		case "firefox":
		    System.out.println("launching firefox");
			break;
		case "chrome":
		    System.out.println("launching chrome");
		default:
			System.out.println("launching safari");
			
	}
	System.out.println("raju");
	System.out.println("raju123");


	}
}



/*o/p:-
launching firefox
launching chrome
launching safari
*/