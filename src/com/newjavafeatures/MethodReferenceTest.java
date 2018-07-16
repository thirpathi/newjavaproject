package com.newjavafeatures;


@FunctionalInterface
interface methodref
{
void m1();	
}


public class MethodReferenceTest {

	public void m8()
	{
		System.out.println("1");
		System.out.println("25");
		System.out.println("250");
		System.out.println("2500");
	}
	
	public static void main(String[] args) {
		
		/*methodref m = MethodReferenceTest::m8;                        // static
		m.m1();*/
		
		MethodReferenceTest b = new MethodReferenceTest();          // non-static 
		methodref m = b::m8;
		m.m1();
	}
}


/*o/p:-
1
25
250
2500
*/