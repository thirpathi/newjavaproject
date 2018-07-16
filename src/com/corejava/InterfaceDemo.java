package com.corejava;


interface Sample
{
	public abstract void m1();
	void m2();
	void m3();
}

abstract class SampleImpl implements Sample
{
	@Override
	public void m1() 
	{
       System.out.println("m1");
	}
	@Override
	public void m2()
	{
		System.out.println("m2");
	}
	public void m4() 
	{
       System.out.println("m4");
	}
}

class SampleImplOne extends SampleImpl
{
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


public class InterfaceDemo 
{
  public static void main(String[] args) 
  {
	//Sample s=new Sample(); ----->CE
	//SampleImpl s=new SampleImpl(); ----->CE 
	  SampleImplOne s=new SampleImplOne();
	  s.m1();
	  s.m2();
	  s.m3();
	  s.m4();
	  s.m5();
	  SampleImpl s1=new SampleImplOne();
	  s1.m1();
	  s1.m2();
	  s1.m3();
	  s1.m4();
	  Sample s2=new SampleImplOne();
	  s2.m1();
	  s2.m2();
	  s2.m3();
	    
  }
}



/*o/p:-
m1
m2
m3
m4
m5

m1
m2
m3
m4

m1
m2
m3
*/

