package com.corejava;


class OneTest
{
	int a;
	public void hello() 
	{
      System.out.println("parent a value is:" +a);
	}
}

class TwoTest extends OneTest
{
	int a;
	String s;
	public TwoTest(int a,String s)
	{
		this.a=a;
		this.s=s;
		super.a=a;
		super.hello();
	}
	public void display()
	{
      System.out.println(a+"  "+s);
	}
}


public class ThisSuperConsrtuctorDemo 
{
   public static void main(String[] args) 
  {
	TwoTest t = new TwoTest(90,"java");
    t.display();
    
    //TwoTest t=new TwoTest(); ----> CE
    
   // OneTest t1=new OneTest();
    //t1.hello();
   
    
  }
}


/*o/p:-
parent a value is:90
90java
parent a value is:0
*/
