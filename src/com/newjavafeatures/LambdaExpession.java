package com.newjavafeatures;

@FunctionalInterface
interface t1
{
	
 int getStringLength(String s);	
 
 
 default void m1()
{
	 System.out.println("m1()");    // optional or N no of methods
}
 
 
 static void m2()
 {
	 System.out.println("m2()");    // optional or N no of methods
 }
 
}


public class LambdaExpession {

	public static void main(String[] args) {
		
//		t1 t = s->{int c = s.length(); return c;};      // lambda expression
		t1 t = s->{ return s.length();}; 
		
//		System.out.println(t.getStringLength("javaselenium"));
		int d= t.getStringLength("javaselenium");
		System.out.println(d);
		
	}
}




/*o/p:-
12*/