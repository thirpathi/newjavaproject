package com.collectoins;

import java.util.ArrayList;



public class ArrayListTest 
{
	 public static void main(String[] args) 
	   {
		 ArrayList m =new ArrayList();   //it allows both HOMO & HETRO elements, duplicate ,insertion order is preserved(both AL & LL).
		 m.add(10);
		 m.add(10);
		 System.out.println(m.add("hello"));
	   //System.out.println(m.set(3, "selenium"));
		 m.add(10.78);
		 System.out.println(m.add("java"));
		 System.out.println(m);
		 System.out.println(m.get(0));
		 System.out.println(m.get(1));
		 System.out.println(m.get(2));


	   }
}






/*o/p:-
true
true
10
10
hello
[10, 10, hello, 10.78, java]
*/