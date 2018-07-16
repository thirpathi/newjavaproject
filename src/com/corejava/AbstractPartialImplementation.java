package com.corejava;


abstract class J                             // Abstruct class
{
	public void m1() 
	{
      System.out.println("m1");
	}
	abstract public void m2();
	abstract public void m3();
}

abstract class K extends J                       // partial implimentation class
{
	public void m4()
	{
      System.out.println("m4");
	}
	@Override
	public void m2()
	{
		System.out.println("m2");
	}
}

abstract class P extends K                               // fully implimentation class (concrete class)
{                                 //But if the class is declared as abstract it may or may not have abstract methods.
	@Override
	public void m3() 
	{
		System.out.println("m3");
	}
	public void m5()
	{
       System.out.println("m5");
	}
}


class Q extends P
{
	
}




public class AbstractPartialImplementation 
{
  public static void main(String[] args) 
  {
	//A a=new A(); //------CE  (Abstruct class)
	//B b=new B(); //------CE  (Abstruct class)
	  
	Q c=new Q();                             //not abstruct class(fully implimentation class) 
	c.m1();
	c.m2();
	c.m3();
	c.m4();
	c.m5();
	  
	 // new P().m1();
  }
}



/*o/p:-
m1
m2
m3
m4
m5
*/
