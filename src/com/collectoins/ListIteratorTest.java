package com.collectoins;

import java.util.*;

public class ListIteratorTest {

	public static void main(String[] args) {
		
		List a = new ArrayList();
		a.add("hello1");
		a.add("hello2");
		a.add("hello3");
		a.add("hello4");
		a.add("hello5");
		System.out.println(a);
		
		ListIterator l = a.listIterator();
		
		while(l.hasNext())
		{
			String s = (String)l.next();
			if(s.equalsIgnoreCase("hello3"))
			{
				System.out.println("selenium");
			}
		}
	}
}



/*o/p:-
[hello1, hello2, hello3, hello4, hello5]
selenium
*/
