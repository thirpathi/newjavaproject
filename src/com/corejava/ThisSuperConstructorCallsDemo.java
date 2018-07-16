package com.corejava;

class FiveTest
{
	int a;
	FiveTest(int a)
	{
		this.a=a;
		System.out.println("FiveTest 1 per con");
	}
	FiveTest()
	{
	this(10);
	System.out.println("FiveTest DEF con");
	}
}

class SixTest extends FiveTest
{
	SixTest()
	{
	super();
	System.out.println("SixTest DEF con");
	}
}


public class ThisSuperConstructorCallsDemo
{
 public static void main(String[] args)
 {
	 SixTest s=new SixTest();
 }
}



/*o/p:-
FiveTest 1 per con
FiveTest DEF con
SixTest DEF con*/
