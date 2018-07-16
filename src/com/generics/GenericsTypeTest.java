package com.generics;

import java.util.*;

public class GenericsTypeTest {

	
	public static void main(String[] args) {
		
		
		/*List<String> a = new LinkedList<String>();     
		a.add("java");
		a.add("hello");
		a.add("hi");
		//a.add(45); ---->CE Homogenious
		
		ListIterator<String> l = a.listIterator();
		while(l.hasNext())
		{
		String s = l.next();          // No need to Type convertion
		System.out.println(s);
		}*/
		
		HashMap<String,Integer> j = new HashMap();   // Runtime is optional   // Generics Type
		j.put("abc", 123);
		System.out.println(j);
		
		
	}
}



/*o/p:-
java
hello
hi
45
{abc=123}
*/