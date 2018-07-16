package com.corejava;


class X
{
	int a;
	X (int a)
	{
		this.a=a;
		System.out.println("x per con");
	}
	public void m1()
	{
      System.out.println("m1()");
	}
}
 
class Z extends X
{
	String s;
	Z (String s)
	{
	     super(10);
		//super();
		this.s=s;
		System.out.println("y per con");
	}
	public void m2()
	{
      System.out.println("m2()");
	}
}



public class ConstructorWithOnePerameter
{
 public static void main(String[] args)
   {
	//Z z=new Z();
    Z z=new Z("java");
    z.m2();
   }
}



/*o/p:-
x per con
y per con
m2()
*/

