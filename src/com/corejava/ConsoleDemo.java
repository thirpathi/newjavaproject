package com.corejava;
             
                                             //initialization of variables through console
import java.util.Scanner;

public class ConsoleDemo 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter string value");
		String value = s.nextLine();  //raju
		System.out.println("after reading values from console is :"+value);

        System.out.println("enter a number");
        float f= s.nextFloat();
		System.out.println("after reading values from console is :"+f);
		
        System.out.println("enter a double value");
        double d= s.nextDouble();
		System.out.println("after reading values from console is :"+d);
	}
}


/*O/P:-
enter string value
mallesh
after reading values from console is :mallesh

enter a number
4
after reading values from console is :4.0

enter a double value
2
after reading values from console is :2.0
*/