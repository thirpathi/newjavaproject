package com.corejava;

                              // overloading
class OverloadOne
{
	
	
public int  add(int a,int b)
{
 int c=a+b;
// System.out.println("int int");
 System.out.println(c);
 return c;
}	

public float  add(int a,float b)
{
 float c=a+b;
 System.out.println(c);
 return c;
}

public double  add(float a,double b)
{
 double c=a+b;
 System.out.println("float double");
 return c;
}


}


public class OverloadingTest
{
public static void main(String[] args) 
{
	OverloadOne o=new OverloadOne();
	o.add(10,20);
	o.add(12,23.5f);
	o.add(23.5f,86);
	o.add('a','b');
	o.add(25.3f,78.4f);
	o.add('a',45.78);
}
}



/*o/p:-
 
int int
int float
float double
int int
float double
float double

*/