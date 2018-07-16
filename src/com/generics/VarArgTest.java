
package com.generics;



class W
{
	/*public void m1()
	{
		System.out.println("no arg method");      
	}
	
	public void m1(String s)
	{
		System.out.println("1 arg method");
	}
	*/

  /*public void m1(String... s)*/    // if the exact methode is not there ,then only the var-arg methode is going to be exceuted...
	public void m1(int... i)
	{
		System.out.println("var arg method");
	}
}


public class VarArgTest {
	
	public static void main(String[] args) {
		
		W a = new W();    // it takes only homogenious elemenets(complete strings OR integers).we can take N'noumber of elements....
		/*a.m1();
		a.m1("hello");
		a.m1("hello","hi");
		a.m1("hello","java","selenium","hi");
		*/
		a.m1();
		a.m1(45);
		a.m1(123,75);
		a.m1(200,5000,1245,23456);
		
     }
}

/*  o/p:-
var arg method
var arg method
var arg method
var arg method
*/