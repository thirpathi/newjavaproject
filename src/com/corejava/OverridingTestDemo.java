
package com.corejava;
                            //overriding for non-static & static (METHOD HIDING)

 class TestOne
{
  public void m1()
{
	System.out.println("TestOne:m1");
}
  
  public void m2()
{
	System.out.println("TestOne:m2");
}
  
}


class TestTwo  extends TestOne
{ 
  @Override
  public  void m1()
{
	 System.out.println("TestTwo:m1");
}
  
  public void m3() 
{
	System.out.println("TestTwo:m3");
}
  
}



public class OverridingTestDemo
{
public static void main(String[] args)
{
	/*TestOne t1=new TestOne();          // normal calling
	t1.m1();
	t1.m2();
	
	TestTwo t2=new TestTwo();         // normal calling
	t2.m1();
	t2.m2();
	t2.m3();*/
	
	TestOne t3=new TestTwo();        //reference method (CHILD CLASS METHOD). b'coz of "NON-static".   --->  "OVERRIDING"
	t3.m1();
	t3.m2();

}	
} 



/*o/p:-
A:m1
B:m1
B:m1
*/

                                    // (METHOD HIDING) for static method to STOP overriding

/*class TestOne
{

 static public void m1()
{
	System.out.println("TestOne:m1");
}

static public void m2()
{
	System.out.println("TestOne:m2");
}

}


class TestTwo  extends TestOne
{

 static public void m1()
{
	 System.out.println("TestTwo:m1");
}

static public void m3() 
{
	System.out.println("TestTwo:m3");
}

}


public class overridingTestDemo
{
public static void main(String[] args)
{
	TestOne t1=new TestOne();                  // normal calling
	t1.m1();
	TestTwo t2=new TestTwo();                 // normal calling     
	t2.m1();
	TestOne t3=new TestTwo();     //original method (PARENT CLASS METHOD). b'coz of "static".    -----> "NOT OVERRIDING" 
	
	t3.m1();
}	
}
*/   


/*o/p:-
	A:m1
	B:m1
	A:m1*/
	
