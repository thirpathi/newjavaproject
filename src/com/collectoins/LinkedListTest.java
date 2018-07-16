package com.collectoins;

import java.util.LinkedList;

public class LinkedListTest
{
   public static void main(String[] args) 
   {
	 LinkedList m =new LinkedList();   //it allows both HOMO & HETRO elements, duplicate ,insertion order is also preserved(both AL & LL).
	 m.add(10);
	 m.add(10);
	 m.add("hello");
	 m.add(10.56f);
	 m.add(10.78);
	 System.out.println(m);
	 System.out.println(m.get(2));

   }
}




/*o/p:-
[10, 10, hello, 10.56, 10.78]
*/