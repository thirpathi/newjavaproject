package com.corejava;

public class DemoSwitch 
{

	public static void main(String[] args)
	{
		String browser="opera";
		switch(browser)
		{
			case "ie":
				System.out.println("launching ie");
				break;
			case "firefox":
			    System.out.println("launching firefox");
			    break;
			case "chrome":
			    System.out.println("launching chrome");
			    break;
			default:
				System.out.println("launching safari");
			    break;

		}
	}
}




/*o/p:-
launching chrome
*/